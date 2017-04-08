package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write(" <head>\r\n");
      out.write("    <title>Bootstrap 101 Template</title>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("    <script src=\"./js/jquery.min.js\"/></script>\r\n");
      out.write("    <script src=\"./bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <style>\r\n");
      out.write("\t\t#clo2{\r\n");
      out.write("\t\t\tbackground-color:grey;\r\n");
      out.write("\t\t\tbox-shadow:inset 1px -1px 1px #444, inset -1px 1px 1px #444;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#clo1{\r\n");
      out.write("\t\t\tbackground-color: #dedef8;\r\n");
      out.write("            box-shadow: inset 1px -1px 1px #444, inset -1px 1px 1px #444;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#clo3{\r\n");
      out.write("\t\t\tbackground-color: #dedef8;box-shadow:inset 1px -1px 1px #444, inset -1px 1px 1px #444;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#clo4{\r\n");
      out.write("            background-color: #dedef8;box-shadow: \r\n");
      out.write("            inset 1px -1px 1px #444, inset -1px 1px 1px #444;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t </style>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <h1>Hello, world!</h1>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("        \t<div class=\"row\" >\r\n");
      out.write("                <div class=\"col-xs-6 col-sm-3\" id=\"clo1\">\r\n");
      out.write("                    <p>qweqwe</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-xs-6 col-sm-3\" id=\"clo2\">\r\n");
      out.write("                    <p>32123</p>\r\n");
      out.write("                    <p>23sas</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            \t<div class=\"clearfix visible-xs\"></div>\r\n");
      out.write("            \t<div class=\"col-xs-6 col-sm-3\" id=\"clo3\">蔷薇蔷薇蔷薇</div>\r\n");
      out.write("            \t<div class=\"col-xs-6 col-sm-3\" id=\"clo4\" >\r\n");
      out.write("                <p>沙发上房顶上</p>\r\n");
      out.write("           \t\t</div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
