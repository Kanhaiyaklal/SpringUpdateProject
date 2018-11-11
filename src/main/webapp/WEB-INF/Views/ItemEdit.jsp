<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<style type="text/css">
options {
	width: 190px;
}

#t {
	border: 1px solid pink;
	width: 500px;
	margin: auto;
	padding: 2px;
	height: 649px;
	margin-top:-10px;
}

h2 {
	text-align: center;
}
#lef
{
float:right;
margin-right:190px;
margin-top:-24px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br>
	<div id="t">
		<form:form method="post" action="update" modelAttribute="item">
		Item Code:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<form:input path="itemId" readonly="true" /><br><br>
Item Code:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<form:input path="itemCode" />
			<br>
			<br>
Item Dimension:
     Width:<form:input path="width" size="3" />
     Length:<form:input path="length" size="3" />
     Height:<form:input path="height" size="3" />
			<br>
			<br>
Base Cost:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<form:input
				path="bcast" />
			<br>
			<br>
Base Currency:&nbsp<form:select path="baseCurrency">
				<form:option value="--Select--" />
				<form:option value="INR" />
				<form:option value="USD" />
				<form:option value="AUS" />
				<form:option value="ERV" />
			</form:select>
			<br>
			<br>

Item Uom:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<form:select path="uom.id">
              
				<form:options items="${list}" itemLabel="umod" itemValue="id" />

			</form:select>
			<br>
			<br>

Sales:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<form:select
				path="saleType.id">

				<form:options items="${sales}" itemLabel="saleMode" itemValue="id" />
			</form:select>
			<br>
			<br>
Purchase:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<form:select
				path="purchaseType.id">

				<form:options items="${purchases}" itemLabel="saleMode"
					itemValue="id" />
			</form:select>
			<br>
			<br>
			Item Customer:<br>
			<form:select path="${custUser.id}" multiple="true">
			<form:option value="">---select---</form:option>
			<form:options items="${custuserType}" itemLabel="utype" itemValue="id"/>

			</form:select>
			<div id="lef">
			Item Vendor:<br>
				<form:select path="${venUsers.id}" multiple="true">
			<form:option value="">---select---</form:option>
			<form:options items="${userType}" itemLabel="utype" itemValue="id"/>

			</form:select></div><br><br>
Description:&nbsp&nbsp&nbsp&nbsp<form:input path="iescription" />
			<br>
			<br>
&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<button
				type="submit" class="btn btn-primary">Update</button>
 ${message}
</form:form>
	</div>
</html>