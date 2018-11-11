<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page import="org.eclipse.jdt.internal.compiler.ast.PrefixExpression"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
h2 {
	text-align: center;
	color: red;
}

.container {
	border: 1px solid gray;
	width: 500px;
	height: 435px;
	margin: auto;
	box-shadow: 4px 4px 4px pink
}

#mess {
	background-color: gray;
	padding: 0px;
	position: relative;
	top: 12px;
	background-size: 100%;
	height: 28px;
	text-align: center;
	color: white;
	font-size: 19px
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>


</head>
<body>
	<h2>Update Recored</h2>
	<div class="container">
		<form:form action="update" method="post" modelAttribute="employee">
			<pre>
	  Id  :   <form:input path="empId" readonly="true" /><br>  
          Name:   <form:input path="Empname" /><br>     
          Gender:<form:radiobutton path="empGeneder" value="Male" />Male
                 <form:radiobutton path="empGeneder" value="Female" />Female <br>    
         Address: <form:textarea path="empAddress" /><br>       
         Country: <form:select path="empcntry"><br>
                  <form:option value="Eng">	England</form:option>
                  <form:option value="Ind">India</form:option>
                  <form:option value="nep">Nepal</form:option>
                  </form:select><br>       
      Language:   <form:checkbox path="empLangs" value="eng" />English
                  <form:checkbox path="empLangs" value="Hin" />Hindi
                  <form:checkbox path="empLangs" value="Mar" />Marathi
                  <form:checkbox path="empLangs" value="Tel" />Telgu<br>
  
                   <input type="submit" value="Update" />

   </pre>
		</form:form>

		<div id="mess">${message}</div>
	</div>
</body>
</html>