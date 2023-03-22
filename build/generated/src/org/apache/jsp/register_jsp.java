package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("    \n");
      out.write("<link rel=\"stylesheet\" href=\"csslink.css\">\n");
      out.write("<script type=\"text/javascript\" src=\"xyz.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body >\n");
      out.write("<div id=\"menu\">\n");
      out.write("<ul>\n");
      out.write("<li></li>   \n");
      out.write("<li style=\"font-size:20px;\">Home</li>\n");
      out.write("<li></li>\n");
      out.write("<li style=\"font-size:20px;\"><a href=\"loginh.jsp\" style=\"text-decoration:none\">Login</a></li>\n");
      out.write("<li></li>\n");
      out.write("<li style=\"font-size:20px;\"><a href=\"register.jsp\" style=\"text-decoration:none\">Register</a></li>\n");
      out.write("<li></li>\n");
      out.write("<li style=\"font-size:20px;\">About us</li>\n");
      out.write("<li></li>\n");
      out.write("<li style=\"font-size:20px;\">Contact us</li>\n");
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write("<div id=\"data\">\n");
      out.write("<center>\n");
      out.write("<form action=\"regis.jsp\" name=\"form1\">\n");
      out.write("<table cellpadding=\"10\" cellspacing=\"12\" bgcolor=\"white\" class=\"t1\">\n");
      out.write("<tr>\n");
      out.write("<tr>\n");
      out.write("<th align=\"center\"><h3><td>Registration</td></h3></th> <br>\n");
      out.write("</tr>\n");
      out.write("<td> Name </td>\n");
      out.write("<td><input type=\"text\" name=\"name\" class=\"t1\" id=\"na\"><br></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>phone</td>\n");
      out.write("<td> <input type=\"text\" name=\"contact\" class=\"t1\" id=\"cn\"><br></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>email</td>\n");
      out.write("<td> <input type=\"text\" name=\"email\" class=\"t1\" id=\"gm\"><br></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>username</td>\n");
      out.write("<td> <input type=\"text\" name=\"un\" class=\"t1\"id=\"un\"><br></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>password</td>\n");
      out.write("<td> <input type=\"text\" name=\"up\" class=\"t1\" id=\"up\"><br></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <th align=\"center\"><td><input type=\"button\" id=\"button\" value=\"register\" onclick=\"Demo()\"></td></th>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("</form>\n");
      out.write("</center>\n");
      out.write("</div>\n");
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
