package p1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class S1 extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>ServletInfo</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<ul>");
            out.println("<li><h2>Request::getContextPath</h2>");
            out.println("<ul><li><h3>" + request.getContextPath() + "</h3></li></ul>");
            out.println("</li>");
            out.println("<li><h2>ServletContext::getServletName</h2>");
            out.println("<ul><li><h3>" + this.getServletName() + "</h3></li></ul>");
            out.println("<li><h2> ServletContext::getServletName </h2>");
            out.println("<ul><li><h3>" + this.getServletName() + "</h3></li></ul>");
            out.println("</li>");
            out.println("<li><h2> ServletContext::toString </h2>");
            out.println("<ul><li><h3>" + this + "</h3></li></ul>");
            out.println("</li>");
            out.println("<li><h2> ServletContext::getServletInfo </h2>");
            out.println("<ul><li><h3>" + this.getServletInfo() + "</h3></li></ul>");
            out.println("</li>");
            out.println("<li><h2> Request::getRemoteHost</h2>");
            out.println("<ul><li><h3>" + request.getRemoteHost() + "</h3></li></ul>");
            out.println("</li>");
            out.println("<li><h2> Request::getRemoteAddr</h2>");
            out.println("<ul><li><h3>" + request.getRemoteAddr() + "</h3></li></ul>");
            out.println("</li>");
            out.println("</ul");
            out.println("</body>");
            out.println("</html>");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
