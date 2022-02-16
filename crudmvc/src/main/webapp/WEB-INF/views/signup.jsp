<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
		<legend>Sign Up</legend>
		<form action="./register" method="post">
			<table>
			<tr>
				<th>User Id</th>
				<th> : </th>
				<td><input type="number" name="id" required="required"></td>
			</tr>
			<tr>
				<th>User Name</th>
				<th> : </th>
				<td><input type="text" name="name" required="required"></td>
			</tr>
			</table>
			</form>
			</fieldset>
</body>
</html>