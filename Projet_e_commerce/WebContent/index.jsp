<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>index page</title>
</head>
<body>



	<!-- récupération du titre renvoyé par le contrôleur avec la clé titreKey -->
	<h1
		style="background-color: lightGreen; color: darkgreen; text-align: center">${attributTitre}</h1>

	<!-- récupération du message renvoyé par le contrôleur avec la clé messageKey -->
	<h2 style="color: orange; text-align: center">${attributMessage}</h2>

	<!-- récupération de la date renvoyé par le contrôleur avec la clé todayKey -->
	<h3 style="color: blue; text-align: center">
		Nous sommes le
		<fmt:formatDate value="${attributDate}" type="date" />
		<br /> il est
		<fmt:formatDate value="${attributDate}" type="time" timeStyle="short" />
	</h3>

	<!-- Lien pour afficher la liste des fonctionnaires -->
	<table align="center" cellspacing="10">

		<tr style="color: blue; font-style: italic; font-size: 14pt">

			<td align="left">Cliquez ici: </td>

			<td align="right" bgcolor="lightgreen"><a
				href="welcome">Consulter nos produits</a></td>
		</tr>

	</table>


</body>
</html>


