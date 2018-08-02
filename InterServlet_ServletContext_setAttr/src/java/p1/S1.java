package p1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
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
            String str = request.getParameter("msg");
            ServletContext sc = getServletContext();
            sc.setAttribute("msg", str);
            out.println("<h1>Set Atrributte" + str +"</h1>");
            String msg1 = (String)sc.getAttribute("msg");
            out.println("Get Attribute_Context message has value = " + msg1);
            out.println("<h1>Servlet S1 at " + request.getContextPath() + "</h1>");
            sc.removeAttribute(msg1);
            out.println("<h4>Removed Attribue : " + msg1 + "</h4>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
