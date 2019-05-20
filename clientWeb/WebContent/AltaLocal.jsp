<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
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
    
    <title>  eAccessible </title>
</head>
<body>
<div data-role="navbar" id="navbar-1">
	<ul>
		<li><a  href="Cerca.jsp" data-icon="search">Cerca</a></li>
		<li><a href="AltaLocal.jsp" data-icon="edit">Alta d'un local</a></li>
	</ul>
</div>


<%
Facade.TipoLocal[] tipoLocal = null;
try{
	Facade.ServeiWebServiceLocator service = new Facade.ServeiWebServiceLocator();
	Facade.ServeiWeb port = service.getServeiWebPort();
	tipoLocal = port.cercaTipoLocal();
}
catch (Exception e) { e.printStackTrace();}
%>
<br>
<form method="post" action="SvlFormulari">
<h2>Tipus de local a donar d'alta:</h2>
<select name="codiTipoLocal"> 
<%for (int i=0; i<tipoLocal.length; i++){%>
	<option value="<%=tipoLocal[i].getCoditipolocal()%>"> <%=tipoLocal[i].getNomtipolocalca()%> </option>
<%} %>	
</select>

<br>
<input type="submit" value="Seguir">
</form>

</body>
</html>