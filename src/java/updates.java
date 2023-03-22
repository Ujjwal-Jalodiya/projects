import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class updates extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
	{
                                    String s1=request.getParameter("n5");

		String s2=request.getParameter("n1");
		String s3=request.getParameter("n2");
		String s4=request.getParameter("n3");
		String s5=request.getParameter("n4");
                                   PrintWriter out=response.getWriter();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///login","root","1211");
			Statement st=con.createStatement();
			st.executeUpdate("update data set name='"+s2+"',phy='"+s3+"',chem='"+s4+"',maths='"+s5+"' where rollno='"+s1+"' ");
                                                    con.close();
			response.sendRedirect("showall");
			
		}
                
		catch(Exception e){
			out.println(e);
		}
		
     
       
  		
	}
}
