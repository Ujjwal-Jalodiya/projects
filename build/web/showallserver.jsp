<%@page import="java.sql.*"%>
<html>
    <head>
         <%@include file="menubar.jsp" %>
         <%
                                     
		try
		{
                 
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///login","root","1211");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from data ");%>
        </head>
        <body>
            <div id="data">
<center>

<form action="insertserver.jsp">
<table cellpadding="12" cellspacing="15" bgcolor="white" class="t1">
    <tr>
    <td>Name</td>
     <td>Roll no.</td>
      <td>Physics</td>
       <td>Chemistry</td>
        <td>Maths</td>
    </tr>
   


	<%		
			
			while(rs.next())
			{%>
                                                       <tr>
                                                    <td><%= rs.getString(1)%></td>
                                                    <td><%= rs.getString(2)%></td>
                                                    <td><%= rs.getString(3)%></td>
                                                    <td><%= rs.getString(4)%></td>
                                                    <td><%= rs.getString(5)%></td>
                                                    </tr>
			<%}
			
			
			
			con.close();
		}
		catch(Exception e)
		{
			out.println(e);
		}
                %>
    
</table>
</center>
</div>
        </body>
        </html>
