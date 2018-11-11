<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head><%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<style type="text/css">.alert{width:500px;margin:auto;}table{margin:auto;width:500px;}th{background:rgb(55,55,55);height:30px;color:white;}#t{margin:auto;padding:10px;}h2{text-align:center;}</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Product Record</h2>
<div id="t">
<table border="1"> 
<tr>
 <th>Id</th>
    <th>Code</th>
    <th>Name</th>
    <th>Dept</th>
    <th>Note</th>
    <th>Delete</th>
    <th>Edit</th>
</tr>
<c:forEach  items="${list}" var="dev">
<tr>
   <td><c:out value="${dev.id}"></c:out>
   <td><c:out value="${dev.code}"/></td>
   <td><c:out value="${dev.name}"></c:out>
  <td><c:out value="${dev.dept}"/></td>
   <td><c:out value="${dev.note}"/></td>
   <td><a href="delete?id=${dev.id}">Delete</a>
<td><a href="edit?id=${dev.id}">Edit</a>
   </tr>
</c:forEach>
</table>

</div>
<div class="container">
 <div class="alert alert-success alert-dismissible">
    <button type="button" class="close" data-dismiss="alert">×</button>
    <strong>Success!</strong>${message}
  </div></div>

</body>
</html>