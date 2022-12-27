<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
ul {
  list-style-type: none;
  margin: 0;
  padding: 25;
  overflow: visible;
}

li {
  float: left;
}

li a {
  display: block;
  padding: 25px;
  background-color: white;
}
</style>
</head>

<body>

<h1>value are found</h1>

<c:forEach items="${list}" var="entity">
Name : ${entity.name} 
<br>
email  : ${entity.email}
<br>
------------------------------------------------------------------------------------
<br>
</c:forEach>
</body>
</html>