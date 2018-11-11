<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
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
#t{
margin-left:88px;
}
h2{
text-align:center;
}
h4{
color:brown;
margin-left:90px;
}
.btn{
margin-left:90px;
}
</style>
</head>
<body>
<h2>Order Management Operation</h2>
<div class="container">
<form:form method="post" action="update" modelAttribute="order">
   Order Id:&nbsp&nbsp<form:input path="id" readonly="true"/><br><br>
   Order Code:&nbsp&nbsp<form:input path="oCode"/><br><br>
   Order Method:<form:select path="oMethod">
    <form:option value="">--Select--</form:option>
    <form:option value="FIFO">FIFO</form:option>
    <form:option value="LIFO">LIFO</form:option>
    <form:option value="FCFO">FCFO</form:option>
    <form:option value="FEFO">FEFO</form:option>
   </form:select><br><br>
   Order Accest:<br>
   <form:checkbox path="oAccest" value="Multi-module" id="t"/>Multi-module<br>
   <form:checkbox path="oAccest" value="Accest Return" id="t"/>Accest Return<br><br>
  Description: &nbsp&nbsp<form:input path="odesc"/><br><br>
   <button type="submit" class="btn btn-primary">Update</button>
</form:form>
</div>
</body>
</html>