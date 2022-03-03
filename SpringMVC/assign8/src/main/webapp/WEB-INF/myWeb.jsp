<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="/Springmvc8/myWeb.html?siteLang=en">English</a>
<a href="/Springmvc8/myWeb.html?siteLang=fr">French</a>
<a href="/Springmvc8/myWeb.html?siteLang=vi">Vietnamese</a>

<form action="/getNothing">

<table>
	<tr>
	<td><spring:message code="label.username"/></td>
	<td><input type="text" name="username"/></td>
	</tr>
	<tr>
	<td><spring:message code="label.password"/></td>
	<td><input type="password" name="password" /></td>
	</tr>
	<tr><td><button type="submit">Submit</button></td></tr>
</table>

</form>
</body>
</html>