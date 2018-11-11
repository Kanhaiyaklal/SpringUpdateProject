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
.err
{
color:red;
position:relative;
float:right;
top:-43px;
}
.err1
{
color:red;
position:relative;
//float:left;
//top:-43px;
}
</style>
</head>
<body>
<h1>User Order Management</h1>
<div class="container">
<form:form action="insert" method="post" modelAttribute="whtype">
User Type:&nbsp&nbsp&nbsp&nbsp&nbsp<form:radiobutton path="utype" value="vendor"/>Vendor &nbsp&nbsp<form:radiobutton path="utype" value="customer"/>Customer</br></br>
<form:errors path="utype" cssClass="err"></form:errors>

User Code&nbsp&nbsp&nbsp&nbsp<form:input path="ucode"/><br><br>
<form:errors path="ucode" cssClass="err"></form:errors>

User For&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<form:input path="ufor"/><br><br>
<form:errors path="ufor" cssClass="err"></form:errors>

User Email:&nbsp&nbsp&nbsp<form:input path="uEmail"/><br><br>
<form:errors path="uEmail" cssClass="err"></form:errors>
User Contact&nbsp<form:input path="uContact"/><br><br>
<form:errors path="uContact" cssClass="err"></form:errors>

User  Id Type&nbsp<form:select path="uIdtype"><br><br>
<form:option value=""/>--select--
<form:option value="Pan"/>Pan
<form:option value="AAdhar"/>AAdhar
<form:option value="Voterid"/>Voterid
<form:option value="other"/>other

</form:select><br><br>
<form:errors path="uIdtype" cssClass="err"></form:errors>
If Other&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<form:input path="other"/> <span class="err1">* (Optional)</span><br><br>
<form:errors path="other" cssClass="err"></form:errors>
Id Number&nbsp&nbsp&nbsp&nbsp<form:input path="idNumber"/><br><br>
<form:errors path="idNumber" cssClass="err"></form:errors>
  &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<button type="submit" class="btn btn-primary active">Register</button>
 </form:form>
 &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp${message}
 </div>
</body>
</html>