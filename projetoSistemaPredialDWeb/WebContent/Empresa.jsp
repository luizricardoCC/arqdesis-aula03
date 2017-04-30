<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>

<%@page import="javabean.Empresa" %>
<%@page import="service.EmpresaService" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Empresa</title>
</head>
<body>
	<% Empresa emp = (Empresa)request.getAttribute("empresa"); %>
	CNPJ: <%= emp.getCnpj()%><br>
	Razão Social: <%= emp.getRazaoSocial()%><br>
	Conjunto: <%= emp.getConjunto()%><br>
	Horário Funcionamento: <%= emp.getHorFunc()%><br>
	Horário Funcionamento AC: <%= emp.getHorFuncAC()%><br>
	Temperatura Máxima AC: <%= emp.getValorMaxAC()%><br>
</body>
</html>