import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class serverins extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
	{
		String s1=request.getParameter("na");
		String s2=request.getParameter("rn");
		String s3=request.getParameter("phy");
		String s4=request.getParameter("che");
		String s5=request.getParameter("maths");
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///login","root","1211");
			Statement st=con.createStatement();
			st.executeUpdate("insert into data values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"')");
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