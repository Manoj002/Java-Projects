package p1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "S1", urlPatterns = {"/S1"})
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
            String s = "User";
            int j = 5;
            String str = request.getParameter("x");
            if(str != null) {
                s = str;
            } else {
                str = s;
            }
            String i = request.getParameter("y");
            if(i != null) {
                j = Integer.parseInt(i);
                for(int k = 0; k < j; k++) {
                    out.println("<h1>Servlet says " +str+ "</h1>");
                }
            }
            else {
                for(int k = 0; k < j; k++) {
                    out.println("<h1>Servlet says " +str+ "</h1>");
                }
            }
            out.println("<h1>Servlet S1 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
