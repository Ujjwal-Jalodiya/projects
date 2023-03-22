import  java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class menu extends HttpServlet
{
	public void doGet(HttpServletRequest request ,HttpServletResponse response)throws IOException,ServletException
	{
		
		PrintWriter out=response.getWriter();
                                    Cookie ck[]=request.getCookies();
                if(ck!=null){
                out.println("<html>");
                out.println("<head>");
                out.println("<link rel='stylesheet' href='csslink.css'>");
                out.println("</head>");
                out.println("<body >");
		out.println("<div id='menu'><ul><li></li>  <li style='font-size:20px;'><a href='menu.html'>menu</a></li><li></li>  <li style='font-size:20px;'><a href='insertcss.html'>insert</a></li><li></li>  <li style='font-size:20px;'><a href='showall'>showall</a></li><li></li>  <li style='font-size:20px;'><a href='update.html'>update</a</li><li></li>  <li style='font-size:20px;'><a href='searchcss.html'>search</a></li><li></li>  <li style='font-size:20px;'><a href='delete.html'>delete</a></li><li></li>  <li style='font-size:20px;'><a href='logincss.html'>logout</a></li></ul></div>");	
		
		
		out.println("</body>");
		out.println("</html>");
		out.close();
                }	
                else{
                response.sendRedirect("logincss.html");
                        }
	}
}

