<%-- 
    Document   : JSP_Procedural_1
    Created on : Dec 9, 2017, 2:14:03 AM
    Author     : yadav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
            fieldset{
                border-color: #ffff;
                background-color: #f3ffff;
                border-style: dashed;
            }
            legend{
                background-color: lightcoral;
                color: white;
            }
        </style>
    </head>
    <body>
        <h1> Value Type v/s Reference Type </h1>
        <fieldset>
            <legend> Value Type </legend>
            <label>
                <%
                   out.println("Creating Value Type Variable i <br>");
                   int i = 10;
                   out.println(" The  value of i = " + i);
                %>
            </label>
        </fieldset>
        <br>
        <fieldset>
            <legend> Reference Type </legend>
            <label> 
                   <%
                     out.println("Creating Referance Type Variable str <br>");
                     String str = "Hello From String";
                     out.println(" The  value of str = " + str);
                   %>
            </label>
        </fieldset>
    </body>
</html>
