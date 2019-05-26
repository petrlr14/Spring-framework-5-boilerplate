<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="${pageContext.request.contextPath}/save" method="post" modelAttribute="student">
		
		<form:input name="code" type="hidden" path="cStudent"/>
	
		<label for="name" >Nombre</label>
		<form:input name="name" id="name" type="text" path="sName" /><br>
		
		<label for="lname" >Apellido</label>
		<form:input name="lname" id="lname" type="text" path="lName" /> <br>
		
		<label for="age" >Edad</label>
		<form:input name="age" id="age" type="number" path="sAge"/><br>
		
		<label>Estado</label><br>
		<form:radiobutton name="status" path="bActivo" id="status_true" value="true"/><label for="status_true">Activo</label><br>
		<form:radiobutton name="status" path="bActivo" id="status_false" value="false"/><label for="status_false">Inactivo</label><br>
		<input type="submit" value="save">
	</form:form>
</body>
</html>