
<%@page import="Facade.Local"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Classes.InfoLocal"%>
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


<% InfoLocal[] locals = (InfoLocal[]) session.getAttribute("Locals"); 

if (locals == null){ %>
<h3>No s'ha trobat cap local!</h3>	
<% }else{ %>

<form method="post" action="SvlFitxa">

<h1>Locals:</h1>

<select name="codiLocal"> 
<%for (int i=0; i<locals.length; i++){%>
	</br>
	<option value="<%=locals[i].getCodilocal()%>"> <%=locals[i].getNomlocal()%>, <%=locals[i].getNomtipolocalca()%>, <%=locals[i].getNomvia()%>, <%=locals[i].getNomcarrer()%>, nº<%=locals[i].getNumero()%> </option>
<%} %>	
</select>

<input type="submit" value="Accedir fitxa">	

</form>
<%} %>

	
</body>
</html>