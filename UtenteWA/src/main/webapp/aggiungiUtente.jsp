<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrazione</title>
</head>
<body>
<div align="center" class="contenitore2">

	<form action="registrazione" method="post" enctype="multipart/form-data">
		<input type="text" class="reg" id="nome" name="nome"  placeholder="nome" required="required"> <br>
		<input type="text" class="reg"id="cognome" name="cognome" 	placeholder="cognome" required="required"> <br>
		<input type="text" class="reg"id="eta" name="eta" 	placeholder="età" required="required"> <br>
		<button type="submit" class="pulsante2"  >Registrati</button>	
	</form>
	</div>
<div align="center">
	<form action="home.jsp">
		<input type="submit" class="pulsante2"   value="Torna Indietro">
	</form>
	</div>
</body>
</html>