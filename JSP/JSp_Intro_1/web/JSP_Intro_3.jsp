<%-- 
    Document   : JSP_Intro_3
    Created on : Dec 9, 2017, 1:16:44 AM
    Author     : yadav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP_Intro_3</title>
    </head>
    <body>
        <h1>This JSP intends to be a scriplet!</h1>
        <%
            out.println("<p>Entering Scriplet_1</p>");
        %>
        <h1>Back to page after completing Scriplet_1</h1>
        <%
            out.println("<p>Leaving Scriplet_1</p>");
        %>
        <h1>Back to page after completing Scriplet_2</h1>
    </body>
</html>
