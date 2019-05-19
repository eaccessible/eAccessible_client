<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

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
		<li><a href="#" data-icon="edit">Alta d'un local</a></li>
	</ul>
</div>

<% Facade.Local local = (Facade.Local) session.getAttribute("Local"); 
if (local == null){ %>
Elegeix un desplegable
<% }else{ %>

<form method="post" action="SvlEliminar">
<input type="hidden" name="codiLocal" value="<%=local.getCodilocal()%>"/>

Nom Local: <input type="text" value="<%=local.getNomlocal() %>"/>
Direcció: <input type="text" value="<%=local.getNomvia(), local.getNomcarrer(), local.getNumero() %>" />
Tipo Local:

<div class="ui-input-btn ui-btn ui-corner-all">
	Eliminar local
	<input type="submit" value="Eliminar local" id="eliminar"/>
</div>

</form>
<%} %>	
</body>
</html>