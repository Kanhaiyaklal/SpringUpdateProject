<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<style type="text/css">table{margin:auto;width:500px;}th{background:rgb(55,55,55);height:30px;color:white;}#t{margin:auto;padding:10px;}h2{text-align:center;}</style>
</head>
<body>
<div id="t">
<table border="1"> 
<tr>
    <th>Id</th>
    <th>Code</th>
    <th>Name</th>
    <th>Project</th>
    <th>Salary</th>
     <th>Delete</th>
    <th>Edit</th>
</tr>
<c:forEach  items="${list}" var="dev">
<tr>
 <td><c:out value="${dev.id}"/></td>
   <td><c:out value="${dev.code}"/></td>
   <td><c:out value="${dev.name}"></c:out>
  <td><c:out value="${dev.project}"/></td>
   <td><c:out value="${dev.salary}"/></td>
      <td><a href="delete?id=${dev.id}">Delete</a>
<td><a href="edit?id=${dev.id}">Edit</a>
   </tr>
</c:forEach>
</table>


</div>
</body>
</html>