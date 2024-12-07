<%@ page isELIgnored="false" language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border=1>
<tr>
<th>SID</th>
<th>SNAME</th>
<th>EDIT</th>
<th>DELETE</th>
</tr>
<c:forEach var="s" items="${list}">
<tr>
<td>${s.sid}</td>
<td>${s.sname}</td>
<td><a href=" /springhibernatemvc/edit/${s.sid}">EDIT</a></td>
<td><a href="/springhibernatemvc/delete/${s.sid}">DELETE</a></td>
</tr>
</c:forEach>

</table>
 
 <a href="add"> Home Page </a> 
</body>
</html>