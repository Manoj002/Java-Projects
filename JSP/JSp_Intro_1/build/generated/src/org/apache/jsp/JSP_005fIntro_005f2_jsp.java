package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class JSP_005fIntro_005f2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP_Intro_2</title>\n");
      out.write("        <style>\n");
      out.write("            dt {\n");
      out.write("                color:red;\n");
      out.write("            }\n");
      out.write("            dd {\n");
      out.write("                color:dodgerblue;\n");
      out.write("            }\n");
      out.write("            li {\n");
      out.write("                background-color: #f3ffff;\n");
      out.write("            }\n");
      out.write("            h1, h2 {\n");
      out.write("                color:white;\n");
      out.write("                background-color: black;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Welcome to Rajesh Patkar Institute of Software Engineering</h1>\n");
      out.write("        <h2>Learning Strategy</h2>\n");
      out.write("        <ul>\n");
      out.write("            <li>\n");
      out.write("                <dl>\n");
      out.write("                    <dt>Live Lectures</dt>\n");
      out.write("                    <dd>\n");
      out.write("                        <ul>\n");
      out.write("                            <li>  \n");
      out.write("                                I  need around 16 to 20 live lectures to cover the syllabus. \n");
      out.write("                            </li>\n");
      out.write("                            <li> \n");
      out.write("                                Important Practical elements are part of the lecture and every \n");
      out.write("                                student is allowed to work at his own speed.\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                The teaching time required in every batch is roughly the same, \n");
      out.write("                                However, the actual time required to complete the batch depends \n");
      out.write("                                on the students.\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </dd>\n");
      out.write("                </dl>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <dl>\n");
      out.write("                    <dt> Video Homework </dt>\n");
      out.write("                    <dd>\n");
      out.write("                        <ul>\n");
      out.write("                            <li> \n");
      out.write("                                Several videos to be viewed by students as homework, \n");
      out.write("                                will be posted in the JavaHub from time to time. \n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                Live lectures will give priority to Design discussions, \n");
      out.write("                                practicals and visualization of critical concepts.\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                Video lectures are for informative topics , revision and routine learning.\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </dd>\n");
      out.write("                </dl>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <dl>\n");
      out.write("                    <dt> Code  Book </dt>\n");
      out.write("                    <dd contenteditable=\"true\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li>\n");
      out.write("                            CodeBook is in beta and is constantly upgrading. \n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                This Book will consist several Programs and Notes.\n");
      out.write("                                CodeBook will be used in Live Lectures as well as reference for homework.\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                The labs section in the CodeBook will suggest additional enhancements to the existing programs.\n");
      out.write("                            </li>     \n");
      out.write("                        </ul>\n");
      out.write("                    </dd>\n");
      out.write("                </dl>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <dl>\n");
      out.write("                    <dt> Forums </dt>\n");
      out.write("                    <dd>\n");
      out.write("                        Students can use the forum for  discussions, difficulties and demonstration of their programs. \n");
      out.write("                    </dd>\n");
      out.write("               </dl>\n");
      out.write("            </li>\n");
      out.write("        <h2> Courses</h2>\n");
      out.write("         <ol>\n");
      out.write("            <li> C C++ DataStructures </li>\n");
      out.write("            <li> Java Technology </li>\n");
      out.write("            <li> C# ASP.Net </li>\n");
      out.write("            <li> Php Database </li>\n");
      out.write("            <li> JavaScript- HTML5 </li>\n");
      out.write("            <li> Java Frameworks </li>\n");
      out.write("            <li> Scala Technology </li>\n");
      out.write("            <li> Cloud Technologies </li>\n");
      out.write("            <li> Android Development </li>\n");
      out.write("        </ol>\n");
      out.write("        </ul>\n");
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
