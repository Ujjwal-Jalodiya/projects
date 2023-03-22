import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class loginDemo extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
	{
		String s1=request.getParameter("un");
		String s2=request.getParameter("up");
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///login","root","1211");
			Statement st=con.createStatement();
			st.executeUpdate("insert into t1 values('"+s1+"','"+s2+"')");
			con.close();
			//response.sendRedirect("logincss.html");
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