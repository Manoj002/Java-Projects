package p1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "S1", urlPatterns = {"/S1"})
public class S1 extends HttpServlet {
    
    PrintWriter getfos;
    PrintWriter postfos;
    
    @Override
    public void init(ServletConfig sc) {
        try {
            String filename = sc.getServletContext().getInitParameter("getstore");
            getfos = new PrintWriter(
                            new BufferedWriter(
                                    new FileWriter(
                                            filename
                                    )
                            ), true
            );
            filename = sc.getServletContext().getInitParameter("poststore");
            postfos = new PrintWriter(
                                new BufferedWriter(
                                        new FileWriter(
                                                filename
                                        )
                                ), true
            );
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet S1</title>");            
            out.println("</head>");
            out.println("<body>");
            int c = 5;
            String s = "User";
            String str = request.getParameter("msg");
            if(str != null) {
                s = str;
                getfos.println(new Date() + "Message = " + s);
            }
            String str1 = request.getParameter("x");
            if(str1 != null) {
                c = Integer.parseInt(str1);
                getfos.println(new Date() + "Count = " + c);
            }
            out.println("<h1>GET</h1>");
            for(int i = 0; i < c; i++) {
                out.println("<h4>Servlet says "+s+"</h4>");
            }
            out.println("<h1>Servlet S1 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet S1</title>");            
            out.println("</head>");
            out.println("<body>");
            int c = 5;
            String s = "User";
            String str = request.getParameter("msg");
            if(str != null) {
                s = str;
                getfos.println(new Date() + "Message = " + s);
            }
            String str1 = request.getParameter("x");
            if(str1 != null) {
                c = Integer.parseInt(str1);
                getfos.println(new Date() + "Count = " + c);
            }
            out.println("<h1>POST</h1>");
            for(int i = 0; i < c; i++) {
                out.println("<h4>Servlet says "+s+"</h4>");
            }
            out.println("<h1>Servlet S1 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    @Override
    public void destroy() {
        getfos.close();
        postfos.close();
    }
}
