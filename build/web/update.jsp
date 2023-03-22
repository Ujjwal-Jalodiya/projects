<%@page import="java.sql.*"%>
<html>
<head>
    <%@include file="menubar.jsp"  %>
</head>
<body >
<div id="data">
<center>

<form action="update.jsp">
<table cellpadding="10" cellspacing="12" bgcolor="white" class="t1">
<tr>
<tr>
<th align="center"><h3><td>SEARCH DATA</td></h3></th> <br>
</tr>
<td>ROLL NO.</td>
<td><input type="text" name="rn" class="t1"><br></td>
</tr>
<tr>
<th align="center"><td><input type="submit" value="search" id="button" name="b1"></td></th>
</tr>

</table>
</form>
    <%
              String s1=request.getParameter("b1");
              if(s1!=null){
                  try{
                 
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///login","root","1211");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from data ");
                        if(rs.next()){
    %>
  <form action="update.jsp">
    <table cellpadding="10" cellspacing="12" bgcolor="white" class="t1">
    <tr>
     <td>Name</td>
     <td><input type="text" value="<%= rs.getString(1)%>" name="t1"></td>
         </tr>
         <tr>
     <td>Rollno.</td>
     <td><input type="text" value="<%= rs.getString(2)%>" name="t2"></td>
         </tr>
         <tr>
     <td>Physics</td>
     <td><input type="text" value="<%= rs.getString(3)%>" name="t3"></td>
         </tr>
         <tr>
     <td>Chemistry</td>
     <td><input type="text" value="<%= rs.getString(4)%>" name="t4"></td>
         </tr>
         <tr>
     <td>Maths</td>
     <td><input type="text" value="<%= rs.getString(5)%>" name="t5"></td>
         </tr>
         <tr><th colspan="2"><input type="submit" value="update"  id="button" name="b2"><th></tr>
         
         <%}
         con.close();
}
catch(Exception e){
out.print(e);

}
}
        %>
  </table>
</form>
</center>
</div>
   

</body>
</html>

<%
                                   String s2=request.getParameter("b2");
                                   if(s2!=null){
                                   String s12=request.getParameter("t2");
                                   String s11=request.getParameter("t1");
		String s13=request.getParameter("t3");
		String s14=request.getParameter("t4");
		String s15=request.getParameter("t5");
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///login","root","1211");
			Statement st=con.createStatement();
			st.executeUpdate("update data set name='"+s11+"',phy='"+s13+"',chem='"+s14+"',maths='"+s15+"' where rollno='"+s12+"'");
			con.close();
			response.sendRedirect("showallserver.jsp");
		}
		catch(Exception e){
			out.println(e);
		}
                                   }
                %>
