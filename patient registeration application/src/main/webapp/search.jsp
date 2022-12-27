<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hospital Form</title>
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
<ul>
  <h1><li><img src="https://upload.wikimedia.org/wikipedia/commons/thumb/7/7c/Edna_Adan_Maternity_Hospital_logo.svg/1606px-Edna_Adan_Maternity_Hospital_logo.svg.png" width="100" height="70" alt=""></a></li></h1>
  <h1><li><a href="search.jsp"></a></li></h1>
  <h1><li><a href="search.jsp"></a></li></h1>
  <h1><li><a href="search.jsp"></a></li></h1>
  <h1><li><a href="search.jsp"></a></li></h1>
  <h1><li><a href="search.jsp"></a></li></h1>
  <h1><li><a href="search.jsp"></a></li></h1>
  <h1><li><a href="search.jsp"></a></li></h1>
  <h1><li><a href="index.jsp">Home</a></li></h1>
</ul>
<br>
<br>
<br>
<br>
<br>
<form action="name" method="get">
<h3>search by Name<input type="text" name="name" placeholder="search" id="Name">&nbsp;&nbsp;&nbsp;<input class="btn btn-primary" type="submit" value="Search"></h3>
</form>
<form action="age" method="get">
<h3>serch by Age greater than<input type="text" name="age" placeholder="search" name="Age">&nbsp;&nbsp;&nbsp;<input type="submit" value="search"></h3>
</form>
<form action="age1" method="get">
<h3>or less than<input type="text" name="age" placeholder="search" value="${entity.age}">&nbsp;&nbsp;&nbsp;<input type="submit" value="search"></h3>

</form>

<p Class="text-success">${message}</p>
</body>
</html>