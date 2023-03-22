import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class delete extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
	{
		String s1=request.getParameter("rn");
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///login","root","1211");
			Statement st=con.createStatement();
			st.executeUpdate("delete from data where rollno='"+s1+"'");
			con.close();
			response.sendRedirect("showall");
		}
		catch(Exception e){
			System.out.println(e);
		}
		PrintWriter out =response.getWriter();
        out.println("<html>");		
        out.println("<body>");		
        out.println("<h1> data inserted</h1>");		
        out.println("</body>");		
        out.println("</html>");	
        out.close();
  		
	}
}