<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
<style type="text/css">
options {
	width: 190px;
}

#t {
	border: 1px solid gray;
	width: 560px;
	height:520px;
	margin: auto;
	padding: 2px;
	margin-top:-10px;
}

h2 {
	text-align: center;
}
#lef
{
float:left;
//margin-right:190px;
margin-top:-17px;
margin-left:60px;
}
#lef1
{
float:left;
margin-left:99px;
margin-top:-17px;
}
.alert
{
width:340px;
margin-left:210px;
margin-top:-40px;
height:50px;	
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Item Recored</h2>
	<div id="t">
		<form:form method="post" action="insert" modelAttribute="item"><br>
&nbsp&nbspItem Code:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<form:input path="itemCode" />
			<br>
			<br>
&nbsp&nbspItem Dimension:
     Width:<form:input path="width" size="3" />
     Length:<form:input path="length" size="3" />
     Height:<form:input path="height" size="3" />
			<br>
			<br>
&nbsp&nbspBase Cost:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<form:input
				path="bcast" />
			<br>
			<br>
&nbsp&nbspBase Currency:&nbsp&nbsp&nbsp<form:select path="baseCurrency">
				<form:option value="--Select--" />
				<form:option value="INR" />
				<form:option value="USD" />
				<form:option value="AUS" />
				<form:option value="ERV" />
			</form:select>
			<br>
			<br>

&nbsp&nbspItem Uom:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<form:select path="uom.id">
              
				<form:options items="${list}" itemLabel="umod" itemValue="id" />

			</form:select>
			<br>
			<br>

&nbsp&nbspSales:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<form:select
				path="saleType.id">

				<form:options items="${sales}" itemLabel="saleMode" itemValue="id" />
			</form:select>
			<br>
			<br>
&nbsp&nbspPurchase:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<form:select
				path="purchaseType.id">

				<form:options items="${purchases}" itemLabel="saleMode"
					itemValue="id" />
			</form:select>
			<br>
			<br>
			<div id="lef1">
			&nbsp&nbspItem Customer:<br>
			&nbsp&nbsp<form:select path="${custUser.id}" multiple="true">
			<form:option value="">---select---</form:option>
			<form:options items="${custuserType}" itemLabel="utype" itemValue="id"/>

			</form:select></div>
			<div id="lef">
			&nbsp&nbspItem Vendor:<br>
				<form:select path="${venUsers.id}" multiple="true">
			<form:option value="">---select---</form:option>
			<form:options items="${userType}" itemLabel="utype" itemValue="id"/>

			</form:select></div><br><br><br><br><br>
&nbsp&nbspDescription:&nbsp&nbsp&nbsp&nbsp<form:input path="iescription" />
			<br>
			<br>
&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<button
				type="submit" class="btn btn-primary">Register</button>
				
				<div class="alert alert-success alert-dismissible">
    <button type="button" class="close" data-dismiss="alert">×</button>
    <strong>Success!</strong>${message}
  </div>

</form:form>
	</div>
</html>