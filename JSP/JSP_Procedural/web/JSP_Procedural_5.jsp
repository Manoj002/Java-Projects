<%-- 
    Document   : JSP_Procedural_5
    Created on : Dec 9, 2017, 11:32:01 AM
    Author     : yadav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP_Procedural_5</title>
    </head>
    <body>
        <%!
            int a = 1;

            double add(double v1, double v2) {
                return v1 + v2;
            }

            double sub(double v1, double v2) {
                return v1 - v2;
            }
        %>
        <%
            double x = 5;
            double y = 5;
        %>
        <%= "<h1>" + add(x + a, y + b) + "</h1>"%>
        <%
            a++;
            b++;
        %>
        <%= "<h1>" + sub(x + a, y + b) + "</h1>"%>
        <%
            a++;
            b++;
        %>

        <%
            double m = Math.random()*100 %100;
            double n = Math.random()*100 %100;
            if( m+n > 50 ){ %>
            <h1> Value Greater than 50 </h1>
            <%}
        %>    
        <%= "<h1>" + mul(x + m + a, y + n + b) + "</h1>"%>
        <%
            a++;
            b++;
        %>
        <%= "<h1>" + div(x + m + a, y + n + b) + "</h1>"%>
        <%!
            int b = 2;

            double div(double v1, double v2) {
                return v1 / v2;
            }

            double mul(double v1, double v2) {
                return v1 * v2;
            }
        %>
    </body>
</html>
