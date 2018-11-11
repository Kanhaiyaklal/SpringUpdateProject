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
h2{
text-align:center;
}
#sub
{
margin-left:75px;
}
</style>
</head>
<body>
<h2>Update Order Management</h2>
<div class="container">
<form:form action="update" method="post" modelAttribute="whtype">
User Id&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<form:input path="id"/><br><br>
User Use:&nbsp&nbsp&nbsp&nbsp&nbsp<form:radiobutton path="utype" value="vendor"/>Vendor &nbsp&nbsp<form:radiobutton path="utype" value="customer"/>Customer</br></br>
User Code&nbsp&nbsp&nbsp&nbsp<form:input path="ucode"/><br><br>
User For&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<form:input path="ufor"/><br><br>
User Email:&nbsp&nbsp&nbsp<form:input path="uEmail"/><br><br>
User Contact&nbsp<form:input path="uContact"/><br><br>
User  Id Type&nbsp<form:select path="uIdtype"><br><br>
<form:option value=""/>--select--
<form:option value="Pan"/>Pan
<form:option value="AAdhar"/>AAdhar
<form:option value="Voterid"/>Voterid
<form:option value="other"/>other

</form:select><br><br>
If Other&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<form:input path="other"/><br><br>
Id Number&nbsp&nbsp&nbsp&nbsp<form:input path="idNumber"/><br><br>
&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp	<input type="submit">
 </form:form>
 &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp${message}
 </div>
 ${an}
</div>
</body>
</html>