<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<style>
body {
	font-family: Verdana, Arial, Helvetica, sans-serif
}
</style>
</head>
<body>
<form:form action="processForm" method="post" modelAttribute="employee">
<h2>Spring MVC Demo - Home Page</h2>
<hr/>
<img src="<spring:url value="/img/header.jpg" />" style="width: 1350px; height: 100px">
<table align="center">
	<tr>
		<td><sup><font color="red" size="2"><b>*</b></font></sup>User Name
					&nbsp;&nbsp;&nbsp;<form:input path="username"/><br></td>
	</tr>
	<tr>
		<td><sup><font color="red" size="2"><b>*</b></font></sup>Password
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<form:input path="email"/><br></td>
	</tr>
	<tr>
		<td><input type="submit" value="Login"></td>
	</tr>
	
	<tr>
		<td>msg: ${msg}</td>
	</tr>
</table> 
</form:form>
</body>

</html>