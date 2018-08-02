package p1;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "S2", urlPatterns = "{/S2}", initParams = {
    @WebInitParam(name = "msg", value = "Annotations can be used for configuration parameters"
    )
})

public class S2 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        ServletOutputStream out = response.getOutputStream();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet S2</title>");            
            out.println("</head>");
            out.println("<body>");
            ServletConfig sc = getServletConfig();
            String msg = sc.getInitParameter("msg");
            out.println("<h3>Servlet S2 got message = " 
                    + msg 
                    + "</h3>"
            );
            out.println("<h4>Servlet S2 got another message = " 
                    + request.getAttribute("fmsg")
                    + "</h4>"
            );
            out.println("<h1>Servlet S2 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }