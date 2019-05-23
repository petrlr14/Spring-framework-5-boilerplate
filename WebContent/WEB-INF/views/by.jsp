<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link rel="stylesheet" href="./resources/css/style.css">
<title>Insert title here</title>
</head>
<body>
	<h1>Se encontraron ${count} libro/s para ${search} en ${type}</h1>
	<table class="table table-striped table-bordered table-hover">
		<thead>
			<tr>
				<th scope="col">Titulo</th>
				<th scope="col">Autor</th>
				<th scope="col">ISBN</th>
				<th scope="col">Género</th>
				<th scope="col">Stock</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${books}" var="book">
			<tr>
				<td>${book.title}</td>
				<td>${book.autor}</td>
				<td>${book.isbn}</td>
				<td>${book.category}</td>
				<td>${book.stock}</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</body>
</html>