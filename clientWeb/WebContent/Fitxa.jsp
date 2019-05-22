<%@page import="Facade.Caracteristica"%>
<%@page import="Facade.TipoLocal"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

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
Classes.InfoLocal tipolocal = (Classes.InfoLocal) session.getAttribute("TipoLocal");
Facade.CaracteristicaValor[] caracteristicaValor = (Facade.CaracteristicaValor[]) session.getAttribute("CaracteristicaValor");
if (local == null){ %>
Elegeix un desplegable
<% }else{ %>

<form method="post" action="SvlEliminar">


<input type="hidden" name="codiLocal" value="<%=local.getCodilocal()%>"/>
<input type="hidden" name="codiTipoLocal" value="<%=tipolocal.getCoditipolocal()%>"/>

<h4>Nom Local:</h4> <%=local.getNomlocal() %>
<h4>Via:</h4> <%=local.getNomvia()%>
<h4>Carrer:</h4> <%=local.getNomcarrer()%>
<h4>Número:</h4> <%=local.getNumero() %>
<h4>Tipo Local:</h4> <%=tipolocal.getNomtipolocalca()%>
<h4>Característiques:</h4> 
<ol start="1">
<%for (int i=0; i<caracteristicaValor.length; i++){%>
	<li><%=caracteristicaValor[i].getNomcaracteristicaca() %> : <%=caracteristicaValor[i].getValor() %> </li>
<%} %>
</ol>


<%} %>
<br>
<input type="submit" value="Eliminar local" id="eliminar"/>
</form>	
<br>
<form method="post" action="SvlValidar">
<input type="hidden" name="codiLocal" value="<%=local.getCodilocal()%>"/>
<input type="submit" value="Validar local" id="validar"/>
</form>

</body>
</html>

