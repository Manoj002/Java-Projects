package p1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "S2", urlPatterns = {"/S2"})
public class S2 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet S2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<p>Entering Servlet S2</p>");
            int c = 0;
            Integer i = (Integer)request.getAttribute("count");
            if(i != null) {
                c = i.intValue();
            }
            RequestDispatcher rd;
            for(int j = 0; j < c; j++) {
                request.setAttribute("x", "Hello_" + j);
                rd = request.getRequestDispatcher("S3");
                rd.include(request, response);
            }
            out.println("<p>Leaving Servlet S2</p>");
            out.println("<h1>Servlet S2 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
