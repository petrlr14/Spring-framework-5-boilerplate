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
	<h1>Se encontraron ${count} libros, de ${autores} cantidad de autores diferentes </h1>
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
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>