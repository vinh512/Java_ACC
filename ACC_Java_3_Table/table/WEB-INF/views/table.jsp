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
    <form action='main' method='POST'>
      <h1>
        <span id='number'>${row}</span><span class='title'> - Row Table:</span>
        <span id='row-input' class='title'>Enter Rows: </span>
        <input type='text' name='rows' placeholder=" Integer (1-80)">
        <input type='submit' value='Submit'>
      </h1>
    </form>
    <table>
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
    </table>
  </body>
</html>
