<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="br.com.matheus.modelo.Cirurgia"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/entrada" var="linkServlet" ></c:url>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="${linkServlet}">
		Paciente
		<input type="text" name="paciente">
		Procedimento
		<input type="text" name="procedimento">
		Médico
		<input type="text" name="medico">
		
		<input type="hidden" name="acao" value="NewCirurgia">
		<input type="submit">
	</form>

</body>
</html>