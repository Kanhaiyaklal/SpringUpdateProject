<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<style type="text/css">#t{border:1px solid;width:400px;margin:auto;padding:10px;}h2{text-align:center;}</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Update Records</h2>
<div id="t">
<form:form method="post" action="all" modelAttribute="item">
 Item Code:<form:input path="iCode"/><br><br>
Item Dimensions
               W<form:checkbox path="iDem" value="w"/>
               L<form:checkbox path="iDem" value="l"/>
               H<form:checkbox path="iDem" value="h"/><br><br>
 Base Cost<form:input path="bCost"/><br><br>
 Base Currency<form:select path="bCurrency">
               <form:option value=""/>--Select--
               <form:option value="INR"/>INR
               <form:option value="USD"/>USD
               <form:option value="AUS"/>AUS
               <form:option value="ERV"/>ERV
 </form:select>  <br>  <br>          
 <input type="submit" value="Update">
</form:form>
</div> 
</body>
</html>