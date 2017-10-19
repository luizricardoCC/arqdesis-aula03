<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta charset="utf-8">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="viewport" content="width=device-width, initial-scale=1">
	    
	    <link href="css/bootstrap.min.css" rel="stylesheet">
	    <link href="css/style.css" rel="stylesheet">
	    
	    <title>Cadastrar Empresa</title>
	</head>
	
	<body>
		
		<script src="js/jquery.min.js"></script>
	    <script src="js/bootstrap.min.js"></script>
	    
		<!-- Barra superior com os menus de navegação -->
	    <c:import url="Menu.jsp"/>
	    
	    <!-- Container Principal -->
	    <div id="main" class="container">
	        <h3 class="page-header">Cadastrar Empresa</h3>
	        <!-- Formulario para inclusao de empresas -->
	        <form action="controller.do" method="post">
	            <!-- area de campos do form -->
	            <div class="row">
	                <div class="form-group col-md-6">
	                    <label for="cnpj">CNPJ</label>
	                    <input type="number" class="form-control" name="cnpj" id="cnpj" required maxlength="11" placeholder="Somente números">
	                </div>
	                <div class="form-group col-md-6">
	                    <label for="razaoSocial">Razão Social</label>
	                    <input type="text" class="form-control" name="razaoSocial" id="razaoSocial" required maxlength="44" placeholder="Nome da Empresa">
	                </div>
	            </div>
	            <div class="row">
	                <div class="form-group col-md-6">
	                    <label for="conjunto">Conjunto</label>
	                    <input type="text" class="form-control" name="conjunto" id="conjunto" required maxlength="1" placeholder="Uma letra (A-Z)">
	                </div>
	
	                <div class="form-group col-md-6">
	                    <label for="horarioFunc">Horário de Funcionamento</label>
	                    <input type="text" class="form-control" name="horarioFunc" id="horarioFunc" required maxlength="11" placeholder="00:00-00:00">
	                </div>
	            </div>
	            <div class="row">
	                <div class="form-group col-md-6">
	                    <label for="horarioFuncAC">Horário de Funcionamento do Ar-Condicionado</label>
	                    <input type="text" class="form-control" name="horarioFuncAC" id="horarioFuncAC" required maxlength="11" placeholder="00:00-00:00">
	                </div>
	                <div class="form-group col-md-6">
	                    <label for="tempMaxAC">Temperatura Máxima do Ar-Condicionado</label>
	                    <input type="number" class="form-control" name="tempMaxAC" id="tempMaxAC" required maxlength="2" placeholder="Temperatura em graus Celsius">
	                </div>
	            </div>
	            <hr />
	            <div id="actions" class="row">
	                <div class="col-md-12">
	                    <button type="submit" class="btn btn-primary" name="command" value="CadastrarEmpresa">Salvar</button>
	                    <a href="ListarEmpresas.jsp" class="btn btn-default">Cancelar</a>
	                </div>
	            </div>
	        </form>
	    </div>
	    
	</body>
</html>
