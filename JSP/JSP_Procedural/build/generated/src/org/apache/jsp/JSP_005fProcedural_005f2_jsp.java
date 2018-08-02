package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class JSP_005fProcedural_005f2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP_Procedural_2</title>\n");
      out.write("        <style>\n");
      out.write("            fieldset {\n");
      out.write("                border-color: #ffffff;\n");
      out.write("                background-color: #f3ffff;\n");
      out.write("                border-style:dashed;\n");
      out.write("                width: 600px;\n");
      out.write("            }\n");
      out.write("            legend {\n");
      out.write("                background-color: yellow;\n");
      out.write("                color: black;\n");
      out.write("                padding:7px;\n");
      out.write("                height: 15px;\n");
      out.write("                border-top-right-radius: 8px;\n");
      out.write("                border-top-left-radius:8px;\n");
      out.write("                box-shadow: 3px 3px 1px #888888;\n");
      out.write("                margin-left:-10px;\n");
      out.write("            }\n");
      out.write("            legend:hover{\n");
      out.write("                background-color: black;\n");
      out.write("                color: white;\n");
      out.write("                padding:7px;\n");
      out.write("                height: 15px;\n");
      out.write("                border-color: black;\n");
      out.write("                border-top-right-radius: 8px;\n");
      out.write("                border-top-left-radius:8px;\n");
      out.write("                border-bottom-left-radius:8px;\n");
      out.write("                border-bottom-right-radius:8px;\n");
      out.write("                box-shadow: 5px 5px 3px #888888;                \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Using request Object</h1>\n");
      out.write("        <fieldset>\n");
      out.write("            <legend>Reading query strings</legend>\n");
      out.write("            <label>\n");
      out.write("                ");

                    int c = 3;
                    String msg = request.getParameter("name");
                    if(msg == null) {
                        msg = "Default Message";
                    } 
                    String count = request.getParameter("count");
                    if(count != null) {
                        c = Integer.parseInt(count);
                    }
                    for(int j = 0; j < c; j++) {
                        out.println(msg + "<br/>");
                    }
                
      out.write("\n");
      out.write("            </label>\n");
      out.write("        </fieldset> <br/>\n");
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
