<%@page import="java.sql.*"%>
<%
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
			response.sendRedirect("showallserver.jsp");
		}
		catch(Exception e){
			System.out.println(e);
		}
                %>