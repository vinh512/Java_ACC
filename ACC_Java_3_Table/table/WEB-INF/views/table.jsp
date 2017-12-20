<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>Random Colored Cells</title>
    <link href="https://fonts.googleapis.com/css?family=Raleway:400,800i" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="resources/style.css">
  </head>
  <body>
    <div>
      <h1 id='number' class='fadeIn'>${row}</h1>
      <h1 class='title'> - Row Table:</h1>
      <form action='main' method='POST'>
        <h1 id='row-input'>
          <span class='title'>Enter Rows: </span>
          <input type='text' name='rows' placeholder=' Integer (1-50)'>
          <input type='submit' value='Submit'>
        </h1>
      </form>
    </div>
    <%
      if ((Boolean) request.getAttribute("errorMsg"))
        out.print("<h1 class='warning'>Invalid Entry</h1>");
    %>
    <table>
      <tbody>
      <%
      // get color values from init params in DD (web.xml)
      String[] colors = (String[]) request.getAttribute("colors");
      int rowNum = (Integer) request.getAttribute("row");
      int colNum = rowNum;
      int randNum = 0;

      // generate the table rows and columns
      for (int row = 1; row <= rowNum; row++) {
        out.println("\t\t<tr>");
          for (int col = 1; col <= colNum; col++) {
            // generate new random number with each iteration for color array
            randNum = (int) (Math.random() * colors.length);

            // colors the number of cells based on the row number
            if (col <= row)
              out.println(String.format("\t\t\t<td style='background-color: %s'></td>", colors[randNum]));
            else
              out.println("\t\t\t<td></td>");
          }
        out.println("\t\t</tr>");
      }
      %>
      </tbody>
    </table>
  </body>
</html>
