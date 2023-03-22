<%@page import="java.sql.*"%>
<html>
<head>
 <%@include file="menubar.jsp"  %>
 
</head>
<body >
<div id="data">
    <center>
 <form action="delete.jsp">




<table cellpadding="10" cellspacing="12" bgcolor="white" class="t1">
<tr>
<tr>
<th align="center"><h3><td>DELETE</td></h3></th> <br>
</tr>
<td>ROLL NO.</td>
<td><input type="text" name="rn" class="t1"><br></td>
</tr>
<tr>
<th align="center"><td><input type="submit" value="delete" id="button" name="b1"></td></th>
</tr>



<%
    
    String s1=request.getParameter("b1");
    if(s1!=null){
		    String s2=request.getParameter("rn");

		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///login","root","1211");
			Statement st=con.createStatement();
			st.executeUpdate("delete from data where rollno='"+s2+"'");
			con.close();
			response.sendRedirect("showall");
		}
		catch(Exception e){
			System.out.println(e);
		}
    }%>
 </form>
 </center>
 </div>
</body>
</html>