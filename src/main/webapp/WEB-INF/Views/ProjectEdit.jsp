<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<style type="text/css">table{margin:auto;width:500px;}th{background:rgb(55,55,55);height:30px;color:white;}#t{border:1px solid; width:500px;margin:auto;padding:10px;}h2{text-align:center;}</style>
</head>
<body>
<h2>Project Record</h2>
<div id="t">
<form:form method="post" action="update" modelAttribute="project">
   Id:&nbsp&nbsp&nbsp<form:input path="id" readonly="true"/><br><br>
   Code:&nbsp&nbsp&nbsp<form:input path="code"/><br><br>
   Name:&nbsp&nbsp<form:input path="name"/><br><br>
   Dept:&nbsp&nbsp&nbsp&nbsp<form:select path="dept"><br><br>
     <form:option value="--Select--"/>--Select--
     <form:option value="Dev"/>
     <form:option value="Ps"/>
     <form:option value="Pd"/>
    
   
   </form:select><br><br>

  Note:&nbsp&nbsp&nbsp<form:input path="note"/><br><br>
  &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="submit" value="Update">
</form:form>
 </div>
</body>
</html>