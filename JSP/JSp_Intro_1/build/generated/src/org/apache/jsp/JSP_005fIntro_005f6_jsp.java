package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class JSP_005fIntro_005f6_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h2> Using if </h2>\n");
      out.write("        ");

            int i = 0;
            out.println("<p> First if </p>");
            if (i == 0) {
                out.println("<p> In First If </p>");
            }
            out.println("<p> Second if </p>");
            if (i > 5) {
                out.println("<p> In Second If </p>");
            }
        
      out.write("\n");
      out.write("        <h2> Using if-else  </h2>\n");
      out.write("        ");

            i = 9;
            out.println("<p> First if-else </p>");
            if (i == 0) {
                out.println("<p> In First If </p>");
            } else {
                out.println("<p> In First Else </p>");
            }
            out.println("<p> Second if-else </p>");
            if (i > 5) {
                out.println("<p> In Second If </p>");
            } else {
                out.println("<p> In Second Else</p>");
            }
        
      out.write("\n");
      out.write("        <h2> Using switch case  </h2>\n");
      out.write("        ");

            for (int k = 0; k < 5; k++) {
                out.println("<p> For Loop Iteration number "+k +"</p>");
                switch (k) {
                    case 0:
                        out.println("<p> Case 0 is being executed </p>");
                        break;
                    case 1:
                        out.println("<p> Case 1 is being executed </p>");
                        break;
                    case 2:
                        out.println("<p> Case 2 is being executed </p>");
                        break;
                    case 3:
                        out.println("<p> Case 3 is being executed </p>");
                        break;
                    default:
                        out.println("<p> Default is being executed </p>");
                        break;
                }
            }
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
