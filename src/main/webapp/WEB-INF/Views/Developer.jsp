<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
<style type="text/css">#t{border:1px solid gray;width:500px;margin:auto;padding:10px;}h2{text-align:center;}</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">



</style>
</head>
<body>
<h2>Developer Recored</h2>
<div id="t">
<form:form method="post" action="insert" modelAttribute="developer">
Code:&nbsp&nbsp<form:input path="code"/><br><br>
Name:&nbsp<form:input path="name"/><br><br>
Project&nbsp<form:select path="project1.id"><br><br>
<form:option value="--Select--"></form:option>
<form:options items="${list}" itemLabel="code" itemValue="id"/>
  </form:select><br><br>
Salary:&nbsp&nbsp<form:input path="salary"/><br><br>
&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp	<button type="submit" class="btn btn-primary active">Register</button> 
</form:form>
<br>
 ${message}
</div>
</body>
</html>