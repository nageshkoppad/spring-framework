<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
<nav class="navbar navbar-expand-lg navbar-light bg-dark">
  <a class="navbar-brand" href="#"><img src="https://www.x-workz.in/Logo.png" class="img-fluid" width="100" height="50"></a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
    <div class="navbar-nav">
      <a class="nav-item nav-link active" href="#" style="color: white;">Home <span class="sr-only">(current)</span></a>
      <a class="nav-item nav-link" href="#" style="color: white;">Features</a>
      <a class="nav-item nav-link" href="#" style="color: white;">Pricing</a>
      <a class="nav-item nav-link disabled" href="#" style="color: white;">Disabled</a>
    </div>
  </div>
</nav>


</head>
<style>
body {
	background-image:
		url("C:\\Users\\NETZWERK\\Downloads\\nagu.png");
		background-repeat: no-repeat;
	background-size: 100%;
	text-align: center;		
	</style>

<body>
<p class="text-success" >${message}</p>
	<p class="text-danger" >${error}</p>
<form action="pass" method="post">
<div>
Brand <input type="text" name="brand" ${entity.brand }><br>
</div>
<div>

Ram <input type="text" name="ram" ${entity.ram }/><br>
</div>
<div>

Processor <input type="text" name="processor" ${entity.processor }/><br>
 </div>
 <div>

Rom <input type="text" name="rom" ${entity.rom }/><br>
 </div>
<input type="submit" value="send">

</form>
</body>
</html>