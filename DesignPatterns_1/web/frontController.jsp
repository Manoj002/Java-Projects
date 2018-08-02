<%-- 
    Document   : frontController
    Created on : Dec 13, 2017, 9:20:16 PM
    Author     : yadav
--%>
<%@page import = "java.util.HashMap" %>
<%@page import = "java.util.Date" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%!
            public void init() {
                HashMap<Integer, String> hm = new HashMap<>();
                hm.put(1, "one.jsp");
                hm.put(2, "two.jsp");
                hm.put(3, "three.jsp");
                getServletContext().setAttribute("map", hm);
            }
        %>

        <h1>Entering Front-Controller</h1>
        <ul>
            <li>Time : <%= new Date()%></li>
            <li>Value of Action is ${param.action}</li>
        </ul>

        <%
            HashMap<Integer, String> m = 
                    (HashMap<Integer, String>)
                    getServletContext().getAttribute("map");
            int c = 1;
            String str = request.getParameter("action");
            if(str != null) {
                try {
                    c = Integer.parseInt(str);
                } catch(Exception ex) {
                    out.println(ex);
                }
            }
            str = m.get(c);
            if(str != null) {
        %>
        <jsp:include page="<%= str%>"/>
        <%
            }
        %>
        
        <h1>Leaving Front Controller</h1>
        <h1> <a href = "index.html">Back</a></h1>
    </body>
</html>
