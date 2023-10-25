<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ses">


<pre>
		
			ID:	${t.sid}
			Name:${t.sname}
			Address:${t.saddr}
			Mobile No:${t.smob}
			Username:${t.uname}
			password:${t.password}
			
	</pre>		

<a href="delete?sid=${t.sid}">Delete</a> 
|| <a href="edit?sid=${t.sid} ">Edit</a>
<a href="login.jsp">Login page</a>

</form>

</body>
</html>