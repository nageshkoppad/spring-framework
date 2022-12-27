<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
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
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<ul>
  <h1><li><a href="#home">Home</a></li></h1>
  <h1><li><a href="#news">News</a></li></h1>
  <h1><li><a href="#contact">Contact</a></li></h1>
  <h1><li><a href=index.jsp>Home</a></li></h1>
</ul>
<br>
<br>
<br>
<br>
<br>
<h3>Patient Details Saved Successfully,your id:${entity.idNo}</h3>
<div class="page">
		<table class="table table-striped table-dark">
			<thead>
				<tr>
					<th scope="col">ID</th>
					<th scope="col">Name</th>
					<th scope="col">Email</th>
					<th scope="col">Age</th>
					<th scope="col">MobileNo</th>
					<th scope="col">Gender</th>
					<th scope="col">Id-Proof</th>
					<th scope="col">Id-value</th>
					<th scope="col">BPL-Card</th>
					<th scope="col">Insurance</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<th scope="row">${entity.idNo}</th>
					<td>${entity.name}</td>
					<td>${entity.email}</td>
					<td>${entity.age}</td>
					<td>${entity.mobile}</td>
					<td>${entity.gender}</td>
					<td>${entity.id}</td>
					<td>${entity.idValue}</td>
					<td>ok</td>
					<td>${entity.incurance}</td>
				</tr>
				</tr>
			</tbody>
		</table>
	</div>

</body>
</html>