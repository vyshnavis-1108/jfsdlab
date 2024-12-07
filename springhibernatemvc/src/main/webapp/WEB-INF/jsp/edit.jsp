<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> Edit Student Record </h1>
<form:form method="post" action="/springhibernatemvc/editsave">
Enter Student ID : <form:input path="sid"/>
<br>
Enter Student NAME: <form:input path="sname"/>
<br>
<input type="submit" value="editsave" />
</form:form>

</body>
</html>