<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update">
id: <input type="number" name="sid" value="${t.sid}">
name: <input type="text" name="sname" value="${t.sname }">
address: <input type="text" name="saddr" value="${t.saddr }">
mob no: <input type="number" name="smob" value="${t.smob }">
username: <input type="text" name="uname" value="${t.uname }">
password: <input type="password" name="password" value="${t.password }">
<button type="submit">submit</button>
</form>
</body>
</html>