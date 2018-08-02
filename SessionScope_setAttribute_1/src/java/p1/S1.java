package p1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
            String str = request.getParameter("msg");
            HttpSession hs = request.getSession();
            out.println("<h4>Session object created with id " 
                    + hs.getId() 
                    +"</h4>"
            );
            hs.setAttribute("msg", str);
            out.println("<p>Servlet received " 
                    + str
                    + "</p>"
            );
            out.println("msg attribute in session has value " + hs.getAttribute("msg"));
            hs.removeAttribute("msg");
            out.println("<p>Attribute msg = " 
                    + hs.getAttribute("msg")
                    +" </p>");
            out.println("<h1>Servlet S1 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
