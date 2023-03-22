import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class servershow extends HttpServlet
{
	public void doGet(HttpServletRequest request ,HttpServletResponse response)throws IOException,ServletException
	{
		
		PrintWriter out=response.getWriter();
                out.println("<html>");
                out.println("<head>");
                out.println("<link rel='stylesheet' href='csslink.css'>");
                out.println("</head>");
                out.println("<body >");
		out.println("<div id='menu'><ul><li></li>  <li style='font-size:20px;'><a href='menu.html'>menu</a></li><li></li>  <li style='font-size:20px;'><a href='insertcss.html'>insert</a></li><li></li>  <li style='font-size:20px;'><a href='showall'>showall</a></li><li></li>  <li style='font-size:20px;'><a href='update.html'>update</a</li><li></li>  <li style='font-size:20px;'><a href='searchcss.html'>search</a></li><li></li>  <li style='font-size:20px;'><a href='delete.html'>delete</a></li><li></li>  <li style='font-size:20px;'><a href='logincss.html'>logout</a></li></ul></div>");	
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///login","root","1211");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from data");
			out.println("<div id='data'>");
			out.println("<center>");
			out.println("<table cellpadding='12' class='t1'>");
			out.println("<tr><td>NAME</td><td>ROLLNO.</td><td>PHYSICS</td><td>CHEMESTRY</td><td>MATHS</td></tr>");
			
			while(rs.next())
			{
			out.println("<tr>");
				
			out.println("<td>" +rs.getString(1)+"</td>");
			out.println("<td>" +rs.getString(2)+"</td>");
			out.println("<td>" +rs.getString(3)+"</td>");
			out.println("<td>" +rs.getString(4)+"</td>");
			out.println("<td>" +rs.getString(5)+"</td>");
			
			
			out.println("</tr>");
			}
			out.println("</center>");
			out.println("</div>");
			
			out.println("</table>");
			
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		out.println("</body>");
		out.println("</html>");
		out.close();
		
	}
}

