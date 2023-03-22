import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class forget extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
	{
		String s1=request.getParameter("un");
                                    
		PrintWriter out=response.getWriter();
		out.println("<html>");
                                   out.println("<head>");
                                   out.println("<link rel='stylesheet' href='csslink.css'>");
                                   out.println("</head>");
                                   out.println("<body >");
                                  out.println( "<div id='menu'><ul><li></li><li style='font-size:20px;'>Home</li><li></li><li style='font-size:20px;'><a href='logincss.html' style='text-decoration:none'>Login</a></li><li></li><li style='font-size:20px;'><a href='registercss.html' style='text-decoration:none'>Register</a></li><li></li><li style='font-size:20px;'>About us</li><li></li><li style='font-size:20px;'>Contact us</li></ul></div>");
                                  out.println("<form  action='reset2'>");
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///login","root","1211");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from t2 where username='"+s1+"'");
			out.println("<div id='data'>");
			out.println("<center>");
			
			if(rs.next())
			{
                                                    out.println("<table cellpadding='12' class='t1'>");
			out.println("<tr><td> username</td>");
			out.println("<td><input type='text' name='n1' value='"+rs.getString(4)+"' class='t1'></td>");
                                                     out.println("</tr>");
                                                     out.println("<tr><td>new password</td>");
			out.println("<td><input type='text' name='n2' class='t1'></td>");
                                                     out.println("</tr>");
                                                     out.println("<tr>");
                                                    out.println("<th align='center'><td><input type='submit' value='submit' id='button'></td></th>");
                                                    out.println("</tr>");
			con.close();
                                                     }
                                                    else{
                                                    
                                                    
                        }

                                                  
                        
			
		}
		catch(Exception e){
			System.out.println(e);
		}
	
  		
	}
}
