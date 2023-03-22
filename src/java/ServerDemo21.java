import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class ServerDemo21 extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
	{
		String s1=request.getParameter("name");
		String s2=request.getParameter("contact");
		String s3=request.getParameter("email");
		String s4=request.getParameter("un");
		String s5=request.getParameter("up");
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///login","root","1211");
			Statement st=con.createStatement();
			st.executeUpdate("insert into t2 values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"')");
			con.close();
			response.sendRedirect("logincss.html");
		}
		catch(Exception e){
			System.out.println(e);
		}
	
  		
	}
}