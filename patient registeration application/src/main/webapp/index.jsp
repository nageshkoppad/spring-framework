<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hospital Form</title>

<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>


<body>
<div class="jumbotron text-center">
<div class="container">
 <div class="row">
    <div class="col-md-4">
      <div>
        <a>
          <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/7/7c/Edna_Adan_Maternity_Hospital_logo.svg/1606px-Edna_Adan_Maternity_Hospital_logo.svg.png" width="150" height="100">
  </a>
      </div>
    </div>
    <div class="col-md-4">
      <div>
       <a>
        </a>
      </div>
    </div>
    <div class="col-md-4">
      <div>
       <a href="search.jsp"><h1>search</h1>
        </a>
      </div>
    </div>
 <br>
 <br>
 <br>
 <br>
<form action="switch" method="post">
<h3>name<input type="text" name="name" placeholder="name" value="${entity.name}"></h3>
<h3>email<input type="text" name="email" placeholder="email" value="${entity.email}"></h3>
<h3>age<input type="text" name="age" value="${entity.age}"></h3>
<h3>mobile no<input type="text" name="mobile" value="${entity.mobile}"></h3>
<h3>gender<input type="text" name="gender" value="${entity.gender}"></h3>
<h3>id proof<select name=id value=${para.id ? 'selected':''}>
<option value="aadher">aadher</option>
<option value="driving">driving licence</option>
<option value="voter">voter id</option>
<option value="ration">ration card</option>
<option value="pan">pan card</option>
</select></h3>
<h3>id value<input type="text" name="idValue" value="${entity.idvalue}"></h3>
<h3>bpl card</h3>
<input type="radio" name="bplCard" value="yes">
<label for="yes" >Yes</label>
        <input type="radio" name="bplCard" value="no">
        <label for="no" >No</label>
<h3>insurance</h3> <input type="radio" name="incurance" value="yes">
         <lsbel for="yes" >Yes</label>
          <input type="radio" name="incurance" value="no">
          <label for="no" >No</label><br>
          <input type="submit" value="save">
</form>
<p Class="text-success">${message}</p>
<p Class="text-danger">${error}</p>
</div>
</body>
</html>