
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class update extends HttpServlet
{
	public void doGet(HttpServletRequest request ,HttpServletResponse response)throws IOException,ServletException
	{
		String s1=request.getParameter("rn");
                                    
		PrintWriter out=response.getWriter();
		out.println("<html>");
                                   out.println("<head>");
                                   out.println("<link rel='stylesheet' href='csslink.css'>");
                                   out.println("</head>");
                                   out.println("<body >");
                                    out.println("<form  action='updates'>");

		out.println("<div id='menu'><ul><li></li>  <li style='font-size:20px;'><a href='menu.html'>menu</a></li><li></li>  <li style='font-size:20px;'><a href='insertcss.html'>insert</a></li><li></li>  <li style='font-size:20px;'><a href='showall'>showall</a></li><li></li>  <li style='font-size:20px;'><a href='update.html'>update</a</li><li></li>  <li style='font-size:20px;'><a href='searchcss.html'>search</a></li><li></li>  <li style='font-size:20px;'>delete</li><li></li>  <li style='font-size:20px;'><a href='logincss.html'>logout</a></li></ul></div>");	
			
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///login","root","1211");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from data where rollno='"+s1+"'");
			out.println("<div id='data'>");
			out.println("<center>");
			out.println("<table cellpadding='12' class='t1'>");
			while(rs.next())
			{
                            
			out.println("<tr><td> Name</td>");
			out.println("<td><input type='text' name='n1' value='"+rs.getString(1)+"' class='t1'></td>");
                                                     out.println("</tr>");
                                                     out.println("<tr><td> Rollno.</td>");
			out.println("<td><input type='text' name='n5' value='"+rs.getString(2)+"' class='t1'></td>");
                                                     out.println("</tr>");
                                                     out.println("<tr><td> Physics</td>");
			out.println("<td><input type='text' name='n2' value='"+rs.getString(3)+"' class='t1'></td>");
                                                     out.println("</tr>");
                                                     out.println("<tr><td> Chemistry</td>");
			out.println("<td><input type='text' name='n3' value='"+rs.getString(4)+"' class='t1'></td>");
                                                     out.println("</tr>");
                                                     out.println("<tr><td> Maths</td>");
			out.println("<td><input type='text' name='n4' value='"+rs.getString(5)+"' class='t1'></td>");
                                                     out.println("</tr>");

			
			
			
			
			}

                                                    out.println("<tr>");
                                                    out.println("<th align='center'><td><input type='submit' value='update' id='button'></td></th>");
                                                    out.println("</tr>");

                                                    
                        
			out.println("</center>");
			out.println("</div>");
                                                    
			out.println("</table>");
                        
                            
                                                    out.println("</from>");
                                                  
                                                     out.println("</body>");
                                                     out.println("</html>");
                                                     out.close();
                                                  
                                                   

                                                    
                                                    
			
		
		}
		catch(Exception e)
		{
			out.println(e);
		}
		
		
	}
}

