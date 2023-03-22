<html>
<head>
        <%@include file="menubar.jsp" %>
</head>
<body>
<div id="data">
<center>

<form action="insertserver.jsp">
<table cellpadding="10" cellspacing="12" bgcolor="white" class="t1">
<tr>
<tr>
<th align="center"><h3><td>INSERT DATA</td></h3></th> <br>
</tr>
<td> NAME</td>
<td><input type="text" name="na" class="t1"><br></td>
</tr>
<tr>
<td>ROLLNO.</td>
<td> <input type="text" name="rn" class="t1"><br></td>
</tr>
<tr>
<td>PHYSICS</td>
<td> <input type="text" name="phy" class="t1"><br></td>
</tr>
<tr>
<td>CHEMISTRY</td>
<td> <input type="text" name="che" class="t1"><br></td>
</tr>
<tr>
<td>MATHS</td>
<td> <input type="text" name="maths" class="t1"><br></td>
</tr>
<tr>
<th align="center"><td><input type="submit" value="Insert" id="button"></td></th>
</tr>
</form>
</center>
</div>
</body>
</html>