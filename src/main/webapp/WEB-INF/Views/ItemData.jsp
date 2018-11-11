<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<style type="text/css">
.alert {
	width: 1200px;
	margin-left: -45px;
	margin-top: 5px;
}

h2 {
	color: red;
	text-align: center;
}

table {
	border: 1px solid;
	margin: auto;
	width: 1200px;
}

th, td {
	padding: 10px;
}

tr:nth-child(even) {
	background-color: #f2f2f2;
}

tr:hover {
	background-color: #ddd;
}

th {
	background-color: #555;
	color: white;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
	<h2>Items Record</h2>
	<table border="1">
		<tr>
			<th>Item Id</th>
			<th>Item Code</th>
			<th>Width</th>
			<th>Length</th>
			<th>Height</th>
			<th>Best Cast</th>
			<th>Best Currency</th>
			<th>Item Uom</th>
			<th>Sales Type</th>
			<th>purchase Type</th>
			<th>Item Type</th>
			<th>Descriptio</th>
			<th>DELETE</th>
			<th>EDIT</th>
		</tr>
		<c:forEach items="${list}" var="item">
			<tr>
				<td><c:out value="${item.itemId}"></c:out>
				<td><c:out value="${item.itemCode}"></c:out>
				<td><c:out value="${item.width}"></c:out>
				<td><c:out value="${item.length}"></c:out>
				<td><c:out value="${item.height}"></c:out>
				<td><c:out value="${item.bcast}"></c:out>
				<td><c:out value="${item.baseCurrency}"></c:out>
				<td><c:out value="${item.itemUom}"></c:out>
				<td><c:out value="${item.saleType.saleMode}"></c:out>
				<td><c:out value="${item.purchaseType.saleMode}"></c:out>
				<td><c:out value="${item.uType}"></c:out>
				<td><c:out value="${item.iescription}"></c:out>
				<td><a href="delete?id=${item.itemId}">Delete</a>
				<td><a href="edit?id=${item.itemId}">Edit</a>
		</c:forEach>


		</tr>
	</table>
	<div class="container">
		<div class="alert alert-success alert-dismissible">
			<button type="button" class="close" data-dismiss="alert">×</button>
			<strong>Success!</strong>${message}
		</div>
	</div>
</body>
</html>