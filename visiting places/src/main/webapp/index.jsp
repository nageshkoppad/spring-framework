<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>Temple Details</title>
<h> Temple Details</h>
<style>
ul {
  list-style-type: none;
  margin: 1;
  padding: 25;
  overflow: visible;
}

li {
  float: left;
}

li a {
  display: block;
  padding: 25px;
  background-color: black;
}
</style>
</head>

<body>
<ul>
  <h1><li><a href="#home">Home</a></li></h1>
  <h1><li><a href="#news">News</a></li></h1>
  <h1><li><a href="#contact">Contact</a></li></h1>
  <h1><li><a href="#about">About</a></li></h1>
</ul>
<br>
<br>
<br>
<br>
  <div>
  &nbsp;&nbsp;<h3><a style="color:red;" href="search.jsp">Search</a></h3>
  </div>
</nav>

<p Class="text-success">${message }</p>
<p Class="text-danger">${error}</p>

<form action="send" method="post" >
Name<input type="text" name="name" value="${entity.name }"><br><br>
<label for="location">Choose a Location:</label>

<select name="location" id="location" ${param.location ? 'selected' : ''}>
  <option value="Bengaluru">Bengaluru</option>
  <option value="Mysore">Mysore</option>
  <option value="Mangalore">Mangalore</option>
  <option value="Udupi">Udupi</option>
</select><br><br>

<label for="God">Choose a God:</label>

<select name="god" id="God" ${param.god ? 'selected' : ''}>
  <option value="Shiva">Shiva</option>
  <option value="Kirshna">Kirshna</option>
  <option value="Venkateshwara">Venkateshwara</option>
  <option value="Ganesha">Ganesha</option>
</select><br><br>

<label for="Pincode">Choose a Pincode:</label>

<select name="pincode" id="pincode" ${param.pincode ? 'selected' : ''}>
  <option value="500570">500570</option>
  <option value="577523">577523</option>
  <option value="546772">546772</option>
  <option value="522533">522533</option>
</select><br><br>

Fees<input type="text" name="fees" value="${entity.fees }"><br><br>
OpenTime<input type="text" name="openTime" value="${entity.openTime }"><br><br>
CloseTime<input type="text" name="closeTime" value="${entity.closeTime }"><br><br>

<input class="btn btn-primary" type="submit" value="Submit">

</form>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</body>
</html>