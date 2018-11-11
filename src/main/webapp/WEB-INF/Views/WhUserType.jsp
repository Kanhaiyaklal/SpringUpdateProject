<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page session="false" %>
<html>
<head>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
th
{
height:40px; 
text-align:center;
background: rgb(55,55,55);
color:white;
}
td{
   height:30px;
  
}
td:hover
{
background: gray;
}
table
{
width:900px;
text-align:center;
margin:auto;
}
h2{
text-align:center;
color:red;
}

</style>
</head>
<body>
<h2>Unit Of Manage Record</h2>
<table border="1">
   <tr>
    <th>Id</th>
    <th>User Type</th>
    <th>User Code</th>
    <th>User For</th>
    <th>User Email</th>
    <th>User Contact</th>
    <th>User Id Type</th>
     <th>If Other</th>
      <th>Id Number</th>
      <th>Delete</th>
      <th>Edit</th>
 <c:forEach items="${list}" var="emp">
  <tr>
  <td>${emp.id}</td>
  <td>${emp.utype}</td>
  <td>${emp.ucode}</td>
  <td>${emp.ufor}</td>
  <td>${emp.uEmail}</td>
  <td>${emp.uContact}</td>
  <td>${emp.uIdtype}</td>
  <td>${emp.other}</td>
  <td>${emp.idNumber}</td>
  <td><a href="delete?id=${emp.id}">Delete</a>
  <td><a href="edit?id=${emp.id}">Edit</a>    
  </tr>
  </c:forEach>
 
</table>
</body>
</html>