package p1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "S3", urlPatterns = {"/S3"})
public class S3 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet S3</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("Entering Servlet S3");
            out.println("E1 prints count = " 
                    + request.getAttribute("count")
            );
            RequestDispatcher rd = request.getRequestDispatcher("S4");
            rd.include(request, response);
            out.println("<h1>Servlet S3 at " + request.getContextPath() + "</h1>");
            out.println("Leaving Servlet S3");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
