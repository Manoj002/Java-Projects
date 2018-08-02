package p1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class Servlet extends HttpServlet {
    
    String str1 = "";
    ServletConfig sc;
    BufferedReader fis;
    
    @Override
    public void init(ServletConfig sc){
        this.sc = sc;
        String filename = sc.getInitParameter("filename");
        try {
            fis = new BufferedReader(new FileReader(filename));
            String str = fis.readLine();
            while(str != null) {
                this.str1 = str;
                str = fis.readLine();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String color = sc.getInitParameter("color");
            String bgcolor = sc.getInitParameter("bgcolor");
            String li_color = sc.getInitParameter("li_color");
            String li_bgcolor = sc.getInitParameter("li_bgcolor");
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Welcome to Servlet1</title>");  
            out.println(
                    "<style>" 
                    + "dt {" 
                    + "color:red;" 
                    + "}"
                    + "dd {" 
                    + "color: dodgerblue;" 
                    + "}" 
                    + "li {" 
                    + "background-color:" + li_bgcolor + ";" 
                    + "color:" + li_color + ";" 
                    + "}"
                    + "h1, h2 {" 
                    + "color:" + color + ";"
                    + "background-color:" + bgcolor +";"
                    + "}"
                    + "</style>"
            );
            out.println("</head>");
            out.println("<body>");
            out.println(str1);
            out.println("<h1>Servlet Servlet1 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    @Override
    public void destroy() {
        try {
            fis.close();
        } catch(Exception e) {
            System.out.println(e);
        }
        
    }
}
