package p1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "S4", urlPatterns = {"/S4"})
public class S4 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet S4</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h4>Entering Servlet S4</h4>");
            out.println("Servlet S4 prints x = " 
                    + request.getAttribute("x")
            );
            out.println("<h1>Servlet S4 at " + request.getContextPath() + "</h1>");
            out.println("<h3>Leaving Servlet S4</h3>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
