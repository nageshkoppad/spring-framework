<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<style>
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: visible;
}

li {
  float: left;
}

li a {
  display: block;
  padding: 30px;
  background-color:black;
}
</style>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<title>Temple Details</title>
<h> Temple Details</h>
</head>
<body>
<ul>
  <h1><li><a href="index.jsp">Home</a></li></h1>
  <h1><li><a href="#news">News</a></li></h1>
  <h1><li><a href="#contact">Contact</a></li></h1>
  <h1><li><a href="#about">About</a></li></h1>
</ul>
<br>
<br>
<br>
<br>



<h1>Search Results Found</h1>


<c:forEach items="${list}" var="entity">
Name : ${entity.name} 
God  : ${entity.god}
</br>
</c:forEach>

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</body>
</html>