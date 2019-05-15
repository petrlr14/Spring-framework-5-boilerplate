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
	<table>
		<tr>
			<th>Name</th>
			<th>Last Name</th>
			<th>Age</th>
			<th>Status</th>
		</tr>
		<tr>
			<td>${student.sName}</td>
			<td>${student.lName}</td>
			<td>${student.sAge}</td>
			<td>${student.activoDelegate}</td>
		</tr>
	</table>
</body>
</html>