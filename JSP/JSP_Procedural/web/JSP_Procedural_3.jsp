<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP_Procedural_3</title>
    </head>
    <body>
        <%!
            int a = 1;
            double add(double v1, double v2) {
            return v1+v2;
        }
            
            double sub(double v1, double v2) {
            return v1-v2;
        }
            
        %>
        
        <%
            double x = 5;
            double y = 5;
            out.println("<h1>" + add(x+a, y+b) + "</h1>");
            a++;
            b++;
            out.println("<h1>" + sub(x + a, y + b) + "</h1>");
            a++;
            b++;
        %>
        
        <%
            double m = 10;
            double n = 10;
            out.println("<h1>" + mul(x+m+a, y+n+b) + "</h1>");
            a++;
            b++;
            out.println("<h1>" + div(x+m+a, y+n+b) +"</h1>");
        %>
        
        <%!
            int b = 2;
            double div(double v1, double v2) {
            return v1/v2;
        }
            double mul(double v1, double v2) {
            return v1*v2;
        }
            
        %>
    </body>
</html>
