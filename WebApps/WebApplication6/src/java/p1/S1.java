package p1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "S1", urlPatterns = {"/S1"}, initParams = {
    @WebInitParam(name = "filename", value = "D://log.txt")})
public class S1 extends HttpServlet {
    
    PrintWriter fos;
    
    @Override
    public void init(ServletConfig sc) {
        try {
            String str = sc.getInitParameter("filename");
            fos = new PrintWriter(
                        new BufferedWriter(
                                new FileWriter(
                                        str
                                )
                        ), true
            );
        } catch (Exception e) {
            System.out.println(e);
        }
    }

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
            int i = 5;
            String s = "User";
            String str1 = request.getParameter("msg");
            if(str1 != null) {
                s = str1;
                fos.println(new Date() + "Message = " + s);
            }
            String str2 = request.getParameter("count");
            if(str2 != null) {
                i = Integer.parseInt(str2);
                fos.println(new Date() + "Count = " + i);
            }
            for(int x = 0; x < i; x++) {
                out.println("<h1>Servlet says " + s + "</h1>");
            }
            out.println("<h1>Servlet S1 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    @Override
    public void destroy() {
        fos.close();
    }
}
