<%-- 
    Document   : JSP_Intro_4
    Created on : Dec 9, 2017, 1:26:59 AM
    Author     : yadav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP_Intro_4</title>
    </head>
    <body>
        <h1> This Page experiments with several primitive datatypes in Java </h1>
        <h2> Let's create and use an Integer variable </h2>
        <%
            out.println("<p>Illustrating use of Integers</p>");
            out.println("<p> Creating variable named <strong>i</strong><p>");
            int i;
            out.println("<p> Initializing the variable with value <em>10</em></p>");
            i = 10;
            out.println("<p> Sending value of <strong> i</strong> to the Browser</p>");
            out.println(i);
       %>
        <h2> Let's create and use a Floating point  variable </h2>
        <%
            out.println("<p>Illustrating use of Floats</p>");
            out.println("<p> Creating variable named <strong>f</strong><p>");
            float f;
            out.println("<p> Initializing the variable with value <em>10.45</em></p>");
            f = 10.45f ;
            out.println("<p> Sending value of <strong> f</strong> to the Browser</p>");
            out.println(f);
       %>
        <h2> Let's create and use a Character variable </h2>
        <%
            out.println("<p>Illustrating use of Characters</p>");
            out.println("<p> Creating variable named <strong>ch</strong><p>");
            char ch;
            out.println("<p> Initializing the variable with value <em>'$'</em></p>");
            ch = '$' ;
            out.println("<p> Sending value of <strong> ch</strong> to the Browser</p>");
            out.println(ch);
       %>
        <h2> Using variables across scriplets </h2>
        <%
            out.println("<p> Creating variable named <strong>k</strong><p>");
            out.println("<p> Initializing the variable with value obtained from variables of other scriplets");
            float k = i+f;
            out.println("<p> Sending value of <strong>k</strong> to the Browser</p>");
            out.println(k);
       %>
    </body>
</html>
