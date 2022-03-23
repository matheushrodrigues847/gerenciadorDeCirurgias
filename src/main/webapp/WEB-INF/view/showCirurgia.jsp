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
	<form action="${linkServlet}" method="post">
		Paciente
		<input type="text" name="paciente" value="${cirurgia.paciente}">
		Procedimento
		<input type="text" name="procedimento" value="${cirurgia.procedimento}">
		Médico
		<input type="text" name="medico" value="${cirurgia.medico }">
		<input type="hidden" name="acao" value="UpdateCirurgia">
		<input type="hidden" name="id" value="${cirurgia.id}">
		<input type="submit" >
	</form>
</body>
</html>