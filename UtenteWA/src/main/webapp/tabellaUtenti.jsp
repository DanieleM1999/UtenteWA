<!DOCTYPE html>
<%@page import="it.dstech.models.Utente"%>
<%@page import="it.dstech.service.GestioneDatabase"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>

<html>
<title>Utenti</title>
<style>
table {
  border-collapse: collapse;
  width: 100%;
}

th, td {
  text-align: left;
  padding: 8px;
}

tr:nth-child(even){background-color: #f2f2f2}

th {
  background-color: #ffbf00;
  color: white;
}
</style>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<body class="UtentePage" >
<form>
<div >


<div class="w3-container" style="background-color: black;color: white;">
  <h1 style="font-family: cursive;text-align: center;">Utenti WebApp</h1>
</div>
<div class="w3-container" style="text-align: center;">	
<div>
	<h2>Lista Utenti</h2>
        <table> class="table table-striped">
			<tr>
			<th>Nome</th>
			<th>Cognome</th>
			<th>Età</th>
			</tr>
			<c:forEach items"${stampaUtente}" var="lista">
			<tr>
			<td><c:out value="${lista.getNome()}"/></td>
			<td><c:out value="${lista.getCognome()}"/></td>
			<td><c:out value="${lista.getEta()}"/></td>
			</tr>
			</c:forEach>
			
		</table>
</div>
</div>
</div>
	<form action="home.jsp" style="text-align: right;">
		<input style="margin-left:23%;margin-top:0.5%;padding: 8px;" type="submit" value="<===">
</div>
</form>
</body>
</html>




