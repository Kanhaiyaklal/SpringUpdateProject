<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
 <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
  table{
   margin-left:20px;
   width:350px;
   text-align:center;
  }
th{
height:35px;
background:rgb(55,55,55);
color:white;
text-align:center;
}
p{
color:red;
margin-left:30px;
}
</style>
</head>
<body>
<h1>File Uploading & Downloading</h1>
<form action="uplaod" method="post" enctype="multipart/form-data">
<pre>
<input type="file" name="file"/><br>
  <input type="submit" value="upload"> 
</pre>

</form>
 &nbsp&nbsp&nbsp&nbsp&nbsp <p>${message}</p>

<table border="1">

 <tr>
 <th>Id</th>
 <th>Name</th>
 <th>Link</th>
 </tr>
 <c:forEach items="${docs}" var="doc">
 <tr>
   <td><c:out value="${doc[0]}"/></td>
   <td><c:out value="${doc[1]}"/></td>
    <td><a href="download?docId=${doc[0]}">
          <span class="glyphicon glyphicon-download"> Download</span>
        </a></td>
  <%--  <td><a href="download?docId=${doc[0]}">Download</a></td> --%>
 </tr>
 </c:forEach>
</table>



</body>
</html>