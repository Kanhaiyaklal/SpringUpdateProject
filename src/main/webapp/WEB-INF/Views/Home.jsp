<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.container
{
border:1px solid gray;
width:500px;
padding:10px;
}
h1{
text-align:center;
}
#sub
{
margin-left:75px;
}
</style>
</head>
<body>
<h1>Unit Of Management</h1>
<div class="container">
<form:form action="insert" method="post" modelAttribute="uom">
 Uom Type:<form:select path="list">
    <form:option value="wa">--Select--</form:option>
    <form:option value="Pack">Packing</form:option> 
    <form:option value="No-Pack">No-Packing</form:option>
    <form:option value="NA">NA</form:option>
   </form:select><br><br>
  <%--  <form:checkbox path="list" value="packing"/>Packing
   <form:checkbox path="list" value="no packing"/>No Packing --%>
  Uom Model:<form:input path="umod"/><br><br>
  Description:<form:input path="udesc"/><br><br>
 <input type="submit" value="Create UOM" id="sub">
</form:form><br>
 &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp${an}
 </div>
</body>
</html>