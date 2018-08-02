<%-- 
    Document   : JSP_Procedural_2
    Created on : Dec 9, 2017, 10:25:44 AM
    Author     : yadav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP_Procedural_2</title>
        <style>
            fieldset {
                border-color: #ffffff;
                background-color: #f3ffff;
                border-style:dashed;
                width: 600px;
            }
            legend {
                background-color: yellow;
                color: black;
                padding:7px;
                height: 15px;
                border-top-right-radius: 8px;
                border-top-left-radius:8px;
                box-shadow: 3px 3px 1px #888888;
                margin-left:-10px;
            }
            legend:hover{
                background-color: black;
                color: white;
                padding:7px;
                height: 15px;
                border-color: black;
                border-top-right-radius: 8px;
                border-top-left-radius:8px;
                border-bottom-left-radius:8px;
                border-bottom-right-radius:8px;
                box-shadow: 5px 5px 3px #888888;                
            }
        </style>
    </head>
    <body>
        <h1>Using request Object</h1>
        <fieldset>
            <legend>Reading query strings</legend>
            <label>
                <%
                    int c = 3;
                    String msg = request.getParameter("name");
                    if(msg == null) {
                        msg = "Default Message";
                    } 
                    String count = request.getParameter("count");
                    if(count != null) {
                        c = Integer.parseInt(count);
                    }
                    for(int j = 0; j < c; j++) {
                        out.println(msg + "<br/>");
                    }
                %>
            </label>
        </fieldset> <br/>
    </body>
</html>
