<%@page import="Facade.Caracteristica"%>
<%@page import="Facade.TipoLocal"%>
<%@page import="Facade.CaracteristicaTipoLocal"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>eAccessible</title>

<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css" />
	<script src="http://code.jquery.com/jquery-2.0.1.min.js"></script>
	<script src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
<meta charset="ISO-8859-1">
<!--- Bootstrap CSS --->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
          crossorigin="anonymous">
    <link rel="stylesheet" href="{% static 'css/base.css' %}">
   	
</head>
<body>
<div data-role="navbar" id="navbar-1">
	<ul>
		<li><a  href="Cerca.jsp" data-icon="search">Cerca</a></li>
		<li><a href="AltaLocal.jsp" data-icon="edit">Alta d'un local</a></li>
	</ul>
</div>

<% String codiTipoLocal = (String) session.getAttribute("codiTipoLocal");
Facade.Caracteristica[] caracteristiques = (Facade.Caracteristica[]) session.getAttribute("caracteristiques");
%>

<h2>Dona d'alta un nou local</h2>
<br>
<h4>Informació del local</h4>
<br>
<form method="post" action="SvlAlta">

<input type="hidden" value=<%=codiTipoLocal%> name="codiTipoLocal">

Nom local:
<input type="text" name="nomLocal">

Nom de la via:
<select type="text" name="nomVia">
	<option value="AV">Avinguda</option>
	<option value="CA">Carrer</option>
	<option value="PL">Plaça</option>
	<option value="PS">Carrer</option>
	<option value="RA">Passeig</option>
	<option value="TR">Travessia</option>
</select>
Codi del carrer:
<input type="text" name="codiCarrer">
Nom del carrer:
<input type="text" name="nomCarrer">
Numero:
<input type="text" name="numero">
Observacions:
<input type="text" name="observacions">
<br>

<h4>Accessibilitat</h4>
Puntua les seguents caracteristiques on 0 és la puntuació més baixa i 5 la més alta
<br>
<input type="hidden" name="caracteristiquesLength" value="<%=caracteristiques.length%>">
<br>
<%for(int i=0; i<caracteristiques.length; i++){ %>
	<input type="hidden" name="codiCaracteristica<%=i%>" value="<%=caracteristiques[i].getCodicaracteristica()%>">
	<%=caracteristiques[i].getNomcaracteristicaca() %>: 
	<select type="text" name="valor<%=i%>">
	<option value="0">0</option>
	<option value="1">1</option>
	<option value="2">2</option>
	<option value="3">3</option>
	<option value="4">4</option>
	<option value="5">5</option>
	</select>
	<br>
<% }%>

<input type="submit" value="Donar d'alta">

</form>


</body>
</html>