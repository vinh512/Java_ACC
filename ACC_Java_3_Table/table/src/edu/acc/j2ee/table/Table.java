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
    
    if (request.getParameter("rows") != null) {      
      row = Integer.parseInt(request.getParameter("rows"));
      // limit max rows to 80
      if (row > 80) {
        row = 80;
      }
    } else { 
      row = 10;
    }    
    
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