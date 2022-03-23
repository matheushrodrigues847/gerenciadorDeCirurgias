<%@page import="java.util.Comparator"%>
<%@page import="java.util.List"%>
<%@page import="br.com.matheus.modelo.Cirurgia"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<br>
	<br>
	<div>
	<a href="entrada?acao=NewCirurgiaForm">Cadastrar nova cirurgia</a>
	</div>
	<br>
	<br>
	<table border="1px" width="70%" >
		<tr>
			<th>Paciente</th>
			<th>Procedimento</th>
			<th>Médico</th>
			
		</tr>
		
		
		<c:forEach items="${cirurgias }" var="cirurgia">
			<tr style="text-align: center">
				<td height="40" style="text-align: center">${cirurgia.paciente }</td>
				<td>${cirurgia.procedimento}</td>
				<td>${cirurgia.medico}</td>
				<td width="5%"><a href="entrada?acao=ShowCirurgia&id=${cirurgia.id}">Editar</a></td>
				<td width="5%"><a href="entrada?acao=DeleteCirurgia&id=${cirurgia.id}">Excluir</a></td>
			</tr>
			<br>
			
			
		</c:forEach>
		
	</table>
</body>
</html>