package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.rajeshpatkar.PiggyBank_1;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" \n");
      out.write("              content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>PiggyBank Client</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>PiggyBank Client</h1>\n");
      out.write("        ");
      com.rajeshpatkar.PiggyBank_1 pg1 = null;
      synchronized (_jspx_page_context) {
        pg1 = (com.rajeshpatkar.PiggyBank_1) _jspx_page_context.getAttribute("pg1", PageContext.PAGE_SCOPE);
        if (pg1 == null){
          pg1 = new com.rajeshpatkar.PiggyBank_1();
          _jspx_page_context.setAttribute("pg1", pg1, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("        <h2>Initial State</h2>\n");
      out.write("        <h3>Balance</h3>\n");
      out.write("        ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.rajeshpatkar.PiggyBank_1)_jspx_page_context.findAttribute("pg1")).getBalance())));
      out.write("\n");
      out.write("        <h3>Last Transaction</h3>\n");
      out.write("        ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.rajeshpatkar.PiggyBank_1)_jspx_page_context.findAttribute("pg1")).getLt())));
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("pg1"), "deposit", "100", null, null, false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("pg1"), "deposit", "50", null, null, false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("pg1"), "withdraw", "25", null, null, false);
      out.write("\n");
      out.write("        <h2>Final State</h2>\n");
      out.write("        <h3>Balance</h3>\n");
      out.write("        ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.rajeshpatkar.PiggyBank_1)_jspx_page_context.findAttribute("pg1")).getBalance())));
      out.write("\n");
      out.write("        <h3>Last Transaction</h3>\n");
      out.write("        ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.rajeshpatkar.PiggyBank_1)_jspx_page_context.findAttribute("pg1")).getLt())));
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
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
