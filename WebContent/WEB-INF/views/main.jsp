<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form action="${pageContext.request.contextPath}/edit" method="post">
		<input type="hidden" name="code">
		<input type="submit" value="Create one">
	</form>

	<form action="${pageContext.request.contextPath}/find" method="post">
		<input type="number" name="code" placeholder="student code">
		<input type="submit" value="Search">
	</form>

	<table>
		<tr>
			<th>Name</th>
			<th>Last Name</th>
			<th>Age</th>
			<th>Status</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<c:forEach items="${students}" var="students">
				<tr>
					<td>${students.sName}</td>
					<td>${students.lName}</td>
					<td>${students.sAge}</td>
					<td>${students.activoDelegate}</td>
					<td><form action="${pageContext.request.contextPath}/edit" method="post">
						<input type="hidden" name="code" value="${students.cStudent}">
						<input type="submit" value="edit">
					</form></td>
					<td><form action="${pageContext.request.contextPath}/delete" method="post">
						<input type="hidden" name="code" value="${students.cStudent}">
						<input type="submit" value="delete">
					</form></td>
				</tr>	
			</c:forEach>
	</table>
</body>
</html>