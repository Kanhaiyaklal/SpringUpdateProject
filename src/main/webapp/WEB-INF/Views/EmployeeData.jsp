<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<style type="text/css">h2{color:red;text-align:center;}table{border:1px solid;margin:auto;} th,td{padding:10px;}tr:nth-child(even){background-color: #f2f2f2;}tr:hover{background-color: #ddd;}th{background-color:#555;color:white;}</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome to Employee Data Page</h2>
    &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<a href="excel">Excel Export</a> | <a href="pdf">PDF Export</a>
<table border="1">
  <tr>
     <th>ID</th>
     <th>NAME</th>
     <th>GENDER</th>
     <th>ADDRESS</th>
     <th>COUNTRY</th>
     <th>LANGUGE</th>
     <th>DELETE</th>
     <th>EDIT</th>
</tr>     
<c:forEach items="${list}" var="emp">
<tr>
<td><c:out value="${emp.empId}"/></td>
<td><c:out value="${emp.empname}"/></td>
<td><c:out value="${emp.empGeneder}"/></td>
<td><c:out value="${emp.empAddress}"/></td>
<td><c:out value="${emp.empcntry}"/></td>
<td><c:out value="${emp.empLangs}"/></td>
<td><a href="delete?id=${emp.empId}">Delete</a>
<td><a href="edit?id=${emp.empId}">Edit</a>
</tr>
</c:forEach>
</table>
<br>
<div class="container">
 <div class="alert alert-success alert-dismissible">
    <button type="button" class="close" data-dismiss="alert">×</button>
    <strong>Success!</strong>${message}
  </div></div>
</body>
</html>
