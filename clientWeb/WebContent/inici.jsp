<%@page import="Facade.Local"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hola</h1>
	<%Facade.TipoLocal[] tlResultat = null;
	try{
		Facade.ServeiWebServiceLocator service = new Facade.ServeiWebServiceLocator();
		Facade.ServeiWeb port = service.getServeiWebPort();
		tlResultat = port.cercaTipoLocal();
	}
	catch (Exception e) { e.printStackTrace();}
	
	for(int i=0; i<tlResultat.length;i=i+1){%>
		<br/>El resultat és <%=tlResultat[i].getNomtipolocalca() %>
	<% }%>
	
</body>
</html>