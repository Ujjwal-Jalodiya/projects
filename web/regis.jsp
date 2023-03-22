<%@page import="java.sql.*"%>
<%
                                   String s1=request.getParameter("name");
		String s2=request.getParameter("contact");
		String s3=request.getParameter("email");
		String s4=request.getParameter("un");
		String s5=request.getParameter("up");
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///login","root","1211");
			Statement st=con.createStatement();
			st.executeUpdate("insert into t2 values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"')");
			con.close();
			response.sendRedirect("loginh.jsp");
		}
		catch(Exception e){
			System.out.println(e);
		}
                %>