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
    <table>
      <%
        String[] colors = (String[]) request.getAttribute("colors");
        int rowNum = (Integer) request.getAttribute("row");
        int colNum = rowNum;

        // prevent negative numbers as parameters
        if (rowNum <= 0) {
          out.println("\t<h1 class='warning'>Invalid Entry</h1>");
          rowNum = 0;
        }

        out.println("\t<h1><span id='number'>" + rowNum + "</span><span id='title'> - Row Table:</span></h1>");

        // generate the table rows and the cells within
        for (int row = 1; row <= rowNum; row++) {
          out.println("\t\t<tr>");
            for (int col = 1; col <= colNum; col++) {
              int randNum = (int) (Math.random() * colors.length);

              // colors the number of cells based on the row number
              if (col <= row) {
                out.println(String.format("\t\t\t<td style='background-color: %s'></td>", colors[randNum]));
              } else {
                out.println("\t\t\t<td></td>");
              }
            }
          out.println("\t\t</tr>");
        }
      %>
    </table>
  </body>
</html>
