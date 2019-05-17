<!DOCTYPE html>
<%@page import="Facade.Accessibilitat"%>
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
    
    <title>  eAccessible </title>
    
   	
</head>

<body>

<div data-role="navbar" id="navbar-1">
	<ul>
		<li><a style="background-color:#addffc" href="#" data-icon="search">Cerca</a></li>
		<li><a href="#" data-icon="edit">Alta d'un local</a></li>
	</ul>
</div>
	

<%
Facade.Local local = new Facade.Local ();
Facade.Accessibilitat[] accessibilitat = null;
try{
	Facade.ServeiWebServiceLocator service = new Facade.ServeiWebServiceLocator();
	Facade.ServeiWeb port = service.getServeiWebPort();
	port.altaLocal(local, accessibilitat);
}
catch (Exception e) { e.printStackTrace();}

%>


<br>
<form method="post" action="SvlAlta">

Dona d'alta un nou local:
<br>
Nom local:
<input type="text" name="nomLocal">
Nom carrer:
<input type="text" name="nomCarrer">
Nom via:
<select type="text" name="nomVia">
	<option value="AV">Avinguda</option>
	<option value="CA">Carrer</option>
	<option value="PL">Plaça</option>
	<option value="PS">Carrer</option>
	<option value="RA">Passeig</option>
	<option value="TR">Travessia</option>
</select>
<br/>
Numero:
<input type="text" name="numero">
Observacions:
<input type="text" name="observacions">
<br>
Accessibilitat
<br>
Nivell:
<input type="text" name="nivell">
<br>
<input type="submit" value="Afegir local">
</form>
</body>
</html>