package p1;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class S1 extends HttpServlet{
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        ServletOutputStream out = response.getOutputStream();
        out.println("<!DOCTYPE HTML>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet S1</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<p>Welcome to the Servlet.</p>");
        RequestDispatcher rd = request.getRequestDispatcher("S2");
        rd.include(request, response);
        out.println("</body>");
        out.println("</html>");
    }
}
