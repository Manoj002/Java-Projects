package p1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "S1", urlPatterns = {"/S1"}, initParams = {
    @WebInitParam(name = "msg", value = "Hello World!!!"),
    @WebInitParam(name = "message", value = "Annotations can be used for configuration parameters")})
public class S1 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet S1</title>");            
            out.println("</head>");
            out.println("<body>");
            ServletConfig sc = getServletConfig();
            String str = sc.getInitParameter("msg");
            out.println("<h1>" + str + "</h1>");
            out.println("<h1>Servlet S1 at " + request.getContextPath() + "</h1>");
            str = sc.getInitParameter("message");
            out.println("<h1>" + str + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
