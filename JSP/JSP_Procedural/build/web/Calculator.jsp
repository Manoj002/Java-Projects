<%@page import = "java.util.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculator</title>
    </head>
    <body>
        <%!
            enum Action {
                ADD, SUB, MUL, DIV
            };
            HashMap<String, Action> hm = new HashMap<>();

            double add(double v1, double v2) {
                return v1 + v2;
            }

            double sub(double v1, double v2) {
                return v1 - v2;
            }

            double mul(double v1, double v2) {
                return v1 * v2;
            }

            double div(double v1, double v2) {
                return v1 / v2;
            }

        %>

        <%
            Action e = Action.ADD;
            hm.put("add", Action.ADD);
            hm.put("sub", Action.SUB);
            hm.put("mul", Action.MUL);
            hm.put("div", Action.DIV);
            String o = request.getParameter("opr");
            String x = request.getParameter("x");
            String y = request.getParameter("y");
            double v1 = 5;
            double v2 = 5;
            try {
                if (x != null) {
                    v1 = Integer.parseInt(x);
                }
                if (y != null) {
                    v2 = Integer.parseInt(y);
                }
                if (o != null && hm.get(o) != null) {
                    e = hm.get(o);
                } else {%>
        <h1>Invalid Operation</h1>
        <h1>Default values assumed</h1>
        <%
                }
            } catch (Exception ex) {
                out.println("<h1>Invalid input</h1>");
                out.println("<h1>Default values assumed</h1>");
            }
            double v = 0;
            switch (e) {
                case ADD:
                    v = add(v1, v2);
                    break;

                case SUB:
                    v = sub(v1, v2);
                    break;

                case DIV:
                    v = div(v1, v2);
                    break;
                case MUL:
                    v = mul(v1, v2);
                    break;
            }

            out.println("<h1> Result =  " + v + "</h1>");
        %>
    </body>
</html>
