
<%@page import="java.sql.*"%>
<%
                                String s1=request.getParameter("un");
		String s2=request.getParameter("up");
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
                            
			response.sendRedirect("menu.jsp");
			}
			else
			{
			 response.sendRedirect("loginh.jsp");
			 
			}
			
			
			con.close();
		}
		catch(Exception e)
		{
			out.println(e);
		}
                %>