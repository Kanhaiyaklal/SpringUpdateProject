<%@page import="org.eclipse.jdt.internal.compiler.ast.PrefixExpression"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
h2 {
	text-align: center;
	//color: red;
}

.container {
	border: 1px solid gray;
	width: 500px;
	height: 330px;
	margin: auto;
		
	//box-shadow: 4px 4px 4px pink
}

#mess {
	//background-color: gray;
	padding: 0px;
	position: relative;
	top: 27px;
	background-size: 100%;
	height: 28px;
	text-align: center;
	color: white;
	font-size: 19px
}
.err
{
color:red;
position:relative;
float:right;
top:-43px;
}
</style>
<link rel="stylesheet" href="/CSS/index.css">
</head>
<body>
	<h2>Welcome To Employee Registration</h2>
	<div class="container">
		<form:form action="insert" method="post" modelAttribute="employee">
			<br> 
          Name:  &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp <form:input path="Empname" /><br><br>           
           <form:errors path="Empname" cssClass="err"/>
           
          Gender:&nbsp&nbsp&nbsp&nbsp&nbsp<form:radiobutton path="empGeneder" value="Male" />Male&nbsp
                 <form:radiobutton path="empGeneder" value="Female" />Female<br><br>         
                 <form:errors path="empGeneder" cssClass="err"/>
                 
         Address: &nbsp&nbsp&nbsp<form:textarea path="empAddress" /><br><br> 
                <form:errors path="empAddress" cssClass="err"/>
                
         Country: &nbsp&nbsp&nbsp&nbsp&nbsp<form:select path="empcntry"><br><br> 
                 <form:option value="">--Select--</form:option>
                  <form:option value="Eng">	England</form:option>
	                  <form:option value="Ind">India</form:option>
                  <form:option value="Eng">Nepal</form:option>
                  </form:select><br><br> 
                  <form:errors path="empcntry" cssClass="err"/> 
                      
         Language: &nbsp<form:checkbox path="empLangs" value="eng" />English&nbsp
                   <form:checkbox path="empLangs" value="Hin" />Hindi&nbsp<br>
                   &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<form:checkbox path="empLangs" value="Mar" />Marathi&nbsp
                   <form:checkbox path="empLangs" value="Tel" />Telgu<br><br>
                   <form:errors path="empLangs" cssClass="err"/>
                 &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<button type="submit" class="btn btn-primary active">Register</button> 
   
		</form:form>
		<div id="mess">${message}</div>
	</div>
</body>
</html>