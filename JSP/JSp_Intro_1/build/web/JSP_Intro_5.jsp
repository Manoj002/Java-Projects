<%-- 
    Document   : JSP_Intro_5
    Created on : Dec 9, 2017, 1:37:10 AM
    Author     : yadav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2> Using Do-While loop </h2>
        <%
            int i = 0;
            do {
                out.println("<p> In Do Loop </p>");
                i = i + 1;
            } while (i < 5);
        %>
        <h2> Using While loop </h2>
        <%
            int j = 0;
            while (j < 5) {
                out.println("<p> In While Loop </p>");
                j = j + 1;
            }
        %>
        <h2> Using For loop </h2>
        <%
            for (int k = 0; k < 5; k++) {
                out.println("<p> In For Loop </p>");
            }
        %>
    </body>
</html>
