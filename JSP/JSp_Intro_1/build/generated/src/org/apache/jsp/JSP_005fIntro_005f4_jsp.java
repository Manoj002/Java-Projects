package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class JSP_005fIntro_005f4_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP_Intro_4</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1> This Page experiments with several primitive datatypes in Java </h1>\n");
      out.write("        <h2> Let's create and use an Integer variable </h2>\n");
      out.write("        ");

            out.println("<p>Illustrating use of Integers</p>");
            out.println("<p> Creating variable named <strong>i</strong><p>");
            int i;
            out.println("<p> Initializing the variable with value <em>10</em></p>");
            i = 10;
            out.println("<p> Sending value of <strong> i</strong> to the Browser</p>");
            out.println(i);
       
      out.write("\n");
      out.write("        <h2> Let's create and use a Floating point  variable </h2>\n");
      out.write("        ");

            out.println("<p>Illustrating use of Floats</p>");
            out.println("<p> Creating variable named <strong>f</strong><p>");
            float f;
            out.println("<p> Initializing the variable with value <em>10.45</em></p>");
            f = 10.45f ;
            out.println("<p> Sending value of <strong> f</strong> to the Browser</p>");
            out.println(f);
       
      out.write("\n");
      out.write("        <h2> Let's create and use a Character variable </h2>\n");
      out.write("        ");

            out.println("<p>Illustrating use of Characters</p>");
            out.println("<p> Creating variable named <strong>ch</strong><p>");
            char ch;
            out.println("<p> Initializing the variable with value <em>'$'</em></p>");
            ch = '$' ;
            out.println("<p> Sending value of <strong> ch</strong> to the Browser</p>");
            out.println(ch);
       
      out.write("\n");
      out.write("        <h2> Using variables across scriplets </h2>\n");
      out.write("        ");

             out.println("<p> Creating variable named <strong>k</strong><p>");
              out.println("<p> Initializing the variable with value obtained from variables of other scriplets");
             float k = i+f;
             out.println("<p> Sending value of <strong>k</strong> to the Browser</p>");
            out.println(k);
       
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
