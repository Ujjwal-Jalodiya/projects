package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/menubar.jsp");
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        ");
      out.write("<html>  \n");
      out.write("    <head>\n");
      out.write("    <link rel=\"stylesheet\" href=\"csslink.css\">\n");
      out.write("</head>\n");
      out.write("<body  >\n");
      out.write("<div id=\"menu\">\n");
      out.write("<ul>\n");
      out.write("<li></li>  \n");
      out.write("<li style=\"font-size:20px;\"><a href=\"menu.jsp\">menu</a></li>\n");
      out.write("<li></li>  \n");
      out.write("<li style=\"font-size:20px;\"><a href=\"insertcss.jsp\">insert</a></li>\n");
      out.write("<li></li>  \n");
      out.write("<li style=\"font-size:20px;\"><a href=\"showallserver.jsp\">showall</a></li>\n");
      out.write("<li></li>  \n");
      out.write("<li style=\"font-size:20px;\"><a href=\"update.jsp\">update</a></li>\n");
      out.write("<li></li>  \n");
      out.write("<li style=\"font-size:20px;\"><a href=\"searchcss.jsp\">search</a></li>\n");
      out.write("<li></li>  \n");
      out.write("<li style=\"font-size:20px;\"><a href=\"delete.jsp\">delete</a></li>\n");
      out.write("<li></li>  \n");
      out.write("<li style=\"font-size:20px;\"><a href=\"loginh.jsp\">logout</a></li>\n");
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write(" </html>");
      out.write("\n");
      out.write("        </head>\n");
      out.write("<body>\n");
      out.write("</body>\n");
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
