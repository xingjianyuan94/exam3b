package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/includes/header.jsp");
    _jspx_dependants.add("/includes/menuPublic.jsp");
    _jspx_dependants.add("/includes/footer.jsp");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Endangered Animals</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"wrap\"> <!--div to hold all other divs -->\n");
      out.write("\n");
      out.write("\n");
      out.write("            ");
      out.write("<div class=\"header\"> <!--header div -->\n");
      out.write("\t\t<div class=\"headerImg\"> <!--header img div -->\n");
      out.write("\t\t<img src=\"animalLogo.jpg\" height = \"150px\" />\n");
      out.write("\t\t</div> <!--close header div -->\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"headerText\"> <!--header text div -->\n");
      out.write("\t\t<h1>Endangered Animals App</h1>\n");
      out.write("\t\t</div> <!--close header div -->\n");
      out.write("\t\t\n");
      out.write("\t\t<br clear=\"all\">\n");
      out.write("\t</div> <!--close header div -->");
      out.write("\n");
      out.write("\n");
      out.write("            <hr>\n");
      out.write("            ");
      out.write("<div class=\"navcontainer\"> <!-- menu div -->\n");
      out.write("\t\t<ul class=\"navlist\">\n");
      out.write("\t\t<li class=\"active\"><a href=\"index.jsp\" id=\"current\">Homepage</a></li>\n");
      out.write("\t\t<li><a href=\"search.jsp\">Search An Animal</a></li>\n");
      out.write("\t\t<li><a href=\"read\">List All Animals</a></li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t</div><!--lose menu div -->");
      out.write("\n");
      out.write("            <hr>\n");
      out.write("\n");
      out.write("            <div class=\"main\"> <!--main div -->\n");
      out.write("                <p>Welcome to the database of current endangered animals, feel free to edit the list!</p>\n");
      out.write("            </div> <!-- close main div -->\n");
      out.write("\n");
      out.write("            <hr>\n");
      out.write("            ");
      out.write("<div class=\"footer\"> <!--footer div -->\n");
      out.write("\t&copy; Copyright 2017 SoftwareDesignAndDevelopment.com | All rights reserved \n");
      out.write("\t\n");
      out.write("</div> <!--close footer div -->");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div> <!-- wrap div end-->\n");
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
