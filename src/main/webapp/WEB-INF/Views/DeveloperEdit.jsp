<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<style type="text/css">#t{border:1px solid;width:400px;margin:auto;padding:10px;}h2{text-align:center;}</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Developer Recored</h2>
<div id="t">
<form:form method="post" action="update" modelAttribute="developer">
Id:&nbsp&nbsp<form:input path="id" readonly="true"/><br><br>
Code:&nbsp&nbsp<form:input path="code"/><br><br>
Name:&nbsp<form:input path="name"/><br><br>
Project&nbsp<form:select path="project1.id"><br><br>
<form:options items="${list}" itemLabel="code" itemValue="id"/>
  </form:select><br><br>
Salary:&nbsp&nbsp<form:input path="salary"/><br><br>
&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp	<input type="submit"value="Update"> 
</form:form>
<br>
</div>
</body>
</html>