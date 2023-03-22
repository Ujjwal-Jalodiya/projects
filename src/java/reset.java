import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class reset extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
	{
                                    String s1=request.getParameter("n1");

		String s2=request.getParameter("n2");
		
                                   PrintWriter out=response.getWriter();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///login","root","1211");
			Statement st=con.createStatement();
			st.executeUpdate("update t2 set password='"+s2+"' where username='"+s1+"'");
                                                    con.close();
			response.sendRedirect("logincss.html");
			
		}
                
		catch(Exception e){
			out.println(e);
		}
		
     
       
  		
	}
}
