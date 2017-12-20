package edu.acc.j2ee.table;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Table extends HttpServlet {
  private String[] colors;

  @Override
  public void init() {
    ServletConfig sc = this.getServletConfig();
    colors = sc.getInitParameter("colors").split(",");
  }

  private void processRequest(HttpServletRequest request, HttpServletResponse response)
  throws IOException, ServletException {
    int row = 0;
    boolean errorMsg = false;

      if (request.getParameter("rows") != null) {
        // enables error to be displayed if invalid user-input
        try {
          row = Integer.parseInt(request.getParameter("rows"));
        } catch (Exception e) {
          errorMsg = true;
        }

        // limit the rows from 1-50
        if (errorMsg)
          row = 0;
        else if (row < 1)
          row = 1;
        else if (row > 50)
          row = 50;

      } else {
        row = 10; // default to 10 rows
      }

    request.setAttribute("errorMsg", errorMsg);
    request.setAttribute("colors", colors);
    request.setAttribute("row", row);
    request.getRequestDispatcher("/WEB-INF/views/table.jsp").forward(request, response);
  }

  @Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException {
		processRequest(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException {
		processRequest(request, response);
	}
}
