<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">-->
<link type="text/css" rel="stylesheet" href="./resources/css/bootstrap.min.css">
<link type="text/css" rel="stylesheet" href="./resources/css/style.css">
<title>La biblio pirata</title>
</head>
<body>
	
	<div class="wrapper">
		<form action="${pageContext.request.contextPath}/get" method="post">
			<label for="selection">Buscar por:</label>
			<select name="selection" class="form-control" style="width:100px; display:inline">
			  <option value="Autor">Autor</option>
			  <option value="ISBN">ISBN</option>
			  <option value="G&eacute;nero">G&eacute;nero</option>
			</select>
			<br>
			
				<input class="form-control form-control-lg" style="width:200px" name="searchQuery" type="text" placeholder="Buscar..." required>
				<input type="submit" value="Buscar" class="btn btn-primary">
			
		</form>
	
		<form action="${pageContext.request.contextPath}/all" method="post">
			<input type="submit" value="Ver todos" class="btn btn-primary">
		</form>
	</div>
	
</body>
</html>