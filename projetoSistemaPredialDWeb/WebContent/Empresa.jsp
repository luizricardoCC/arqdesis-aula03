<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@page import="javabean.Empresa" %>
<%@page import="service.EmpresaService" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
    
    <title>Visualizar Empresa</title>
</head>
	<body>
		<script src="js/jquery.min.js"></script>
	    <script src="js/bootstrap.min.js"></script>
		
		<!-- Barra superior com os menus de navegação -->
		<c:import url="Menu.jsp"/>

        <!-- Container Principal -->
        <div id="main" class="container">
            <h3 class="page-header">Visualizar Empresa CNPJ ${empresa.cnpj}</h3>
            <div class="row">
                <div class="col-md-12">
                    <p><strong>Razão Social</strong></p>
                    <p>
                        ${empresa.razaoSocial}
                    </p>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6">
                    <p><strong>Conjunto</strong></p>
                    <p>
                        ${empresa.conjunto}
                    </p>
                </div>
                <div class="col-md-6">
                    <p><strong>Horário Funcionamento</strong></p>
                    <p>
                        ${empresa.horFunc}
                    </p>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6">
                    <p><strong>Horário Funcionamento do Ar-Condicionado</strong></p>
                    <p>
                        ${empresa.horFuncAC}
                    </p>
                </div>
                <div class="col-md-6">
                    <p><strong>Temperatura Máxima do Ar-Condicionado</strong></p>
                    <p>
                        ${empresa.valorMaxAC}
                    </p>
                </div>
            </div>
            <hr />
            <div id="actions" class="row">
                <div class="col-md-12">
                    <a href="cadastrar.html" class="btn btn-default">Voltar</a>
                </div>
            </div>
        </div>

	</body>
</html>