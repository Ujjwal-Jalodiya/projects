import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class htmlloginserver extends HttpServlet
{
	public void doGet(HttpServletRequest request ,HttpServletResponse response)throws IOException,ServletException
	{
		String s1=request.getParameter("un");
		String s2=request.getParameter("up");
		PrintWriter out=response.getWriter();
		out.println("<html>"); 
		out.println("<body>");
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///login","root","1211");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from t2 where username='"+s1+"' AND password='"+s2+"' ");
			
			
			if(rs.next())
			{
                            Cookie ck=new Cookie("un","ram");
                            ck.setMaxAge(60*30);
                            response.addCookie(ck);
                            
			response.sendRedirect("menu");
			}
			else
			{
			 response.sendRedirect("logincss.html");
			 
			}
			
			
			con.close();
		}
		catch(Exception e)
		{
			out.println(e);
		}
		out.println("</body>");
		out.println("</html>");
		out.close();
		
	}
}