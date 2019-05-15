
<%@page import="Facade.Local"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Locals</title>

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
		<li><a  href="Cerca.html" data-icon="search">Cerca</a></li>
		<li><a href="#" data-icon="edit">Alta d'un local</a></li>
	</ul>
</div>


<% Facade.Local[] tlResultat = (Local[]) session.getAttribute("Locals"); %>

Hola, el primer local trobat és <%=tlResultat[0].getNomlocal()%> !! 

	
</body>
</html>