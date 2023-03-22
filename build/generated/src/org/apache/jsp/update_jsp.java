package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    ");
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
      out.write("</head>\n");
      out.write("<body >\n");
      out.write("<div id=\"data\">\n");
      out.write("<center>\n");
      out.write("\n");
      out.write("<form action=\"update.jsp\">\n");
      out.write("<table cellpadding=\"10\" cellspacing=\"12\" bgcolor=\"white\" class=\"t1\">\n");
      out.write("<tr>\n");
      out.write("<tr>\n");
      out.write("<th align=\"center\"><h3><td>SEARCH DATA</td></h3></th> <br>\n");
      out.write("</tr>\n");
      out.write("<td>ROLL NO.</td>\n");
      out.write("<td><input type=\"text\" name=\"rn\" class=\"t1\"><br></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<th align=\"center\"><td><input type=\"submit\" value=\"search\" id=\"button\" name=\"b1\"></td></th>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("</form>\n");
      out.write("    ");

              String s1=request.getParameter("b1");
              if(s1!=null){
                  try{
                 
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///login","root","1211");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from data ");
                        if(rs.next()){
    
      out.write("\n");
      out.write("  <form action=\"update.jsp\">\n");
      out.write("    <table cellpadding=\"10\" cellspacing=\"12\" bgcolor=\"white\" class=\"t1\">\n");
      out.write("    <tr>\n");
      out.write("     <td>Name</td>\n");
      out.write("     <td><input type=\"text\" value=\"");
      out.print( rs.getString(1));
      out.write("\" name=\"t1\"></td>\n");
      out.write("         </tr>\n");
      out.write("         <tr>\n");
      out.write("     <td>Rollno.</td>\n");
      out.write("     <td><input type=\"text\" value=\"");
      out.print( rs.getString(2));
      out.write("\" name=\"t2\"></td>\n");
      out.write("         </tr>\n");
      out.write("         <tr>\n");
      out.write("     <td>Physics</td>\n");
      out.write("     <td><input type=\"text\" value=\"");
      out.print( rs.getString(3));
      out.write("\" name=\"t3\"></td>\n");
      out.write("         </tr>\n");
      out.write("         <tr>\n");
      out.write("     <td>Chemistry</td>\n");
      out.write("     <td><input type=\"text\" value=\"");
      out.print( rs.getString(4));
      out.write("\" name=\"t4\"></td>\n");
      out.write("         </tr>\n");
      out.write("         <tr>\n");
      out.write("     <td>Maths</td>\n");
      out.write("     <td><input type=\"text\" value=\"");
      out.print( rs.getString(5));
      out.write("\" name=\"t5\"></td>\n");
      out.write("         </tr>\n");
      out.write("         <tr><th colspan=\"2\"><input type=\"submit\" value=\"update\"  id=\"button\" name=\"b2\"><th></tr>\n");
      out.write("         \n");
      out.write("         ");
}
         con.close();
}
catch(Exception e){
out.print(e);

}
}
        
      out.write("\n");
      out.write("  </table>\n");
      out.write("</form>\n");
      out.write("</center>\n");
      out.write("</div>\n");
      out.write("   \n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");

                                   String s2=request.getParameter("b2");
                                   if(s2!=null){
                                   String s12=request.getParameter("t2");
                                   String s11=request.getParameter("t1");
		String s13=request.getParameter("t3");
		String s14=request.getParameter("t4");
		String s15=request.getParameter("t5");
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///login","root","1211");
			Statement st=con.createStatement();
			st.executeUpdate("update data set name='"+s11+"',phy='"+s13+"',chem='"+s14+"',maths='"+s15+"' where rollno='"+s12+"'");
			con.close();
			response.sendRedirect("showallserver.jsp");
		}
		catch(Exception e){
			out.println(e);
		}
                                   }
                
      out.write('\n');
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
