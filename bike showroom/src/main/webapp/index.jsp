<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html><meta charset="ISO-8859-1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<head>

<title></title>
</head>
<body>

<a href=search.jsp>serach</a>
	<form action="send" method="post">
		<h4>
			<pre>
Brand<select type="text" name="brand" value="${para.brand ? 'selected':''}">
<option value="hero honda">hero honda</option>
<option value="suzuki">suzuki</option>
<option value="tvs">tvs</option>
<option value="duke">duke</option>
</select> 
Owner <input type="text" name="owner"><br>
Location <select type="text" name="location" value="${para.location ? 'selected':''}">
<option value="beng">beng</option>
<option value="mang">mang</option>
<option value="mysore">mysore</option>
<option value="belagavi">belagavi</option>
<option value="kolkata">kolkata</option>
<option value="mumbai">mumbai</option>
<option value="hubli">hubli</option>
<option value="dharwad">dharwad</option>
</select><br>
Ambassador<input type="text" name="ambassador" value=${entity.ambassador}><br>
Descsription<input type="text" name="descsription" value="${entity.descsription}"><br><br>
<input type="submit" value="send" class="btn btn-success">
	</form>
	<p Class="text-success">${message}</p>
<p Class="text-danger">${error}</p>
	
</body>
</html>