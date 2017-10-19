<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

        <!DOCTYPE html>
        <html lang="pt-br">

        <head>
            <meta charset="utf-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <title>Sistema Predial - Editar Empresa</title>

            <link href="css/bootstrap.min.css" rel="stylesheet">
            <link href="css/style.css" rel="stylesheet">
        </head>

        <body>
                <!-- Barra superior com os menus de navegação -->
				<c:import url="Menu.jsp"/>
                <!-- Container Principal -->
                <div id="main" class="container">
                    <h3 class="page-header">Editar Empresa #${empresa.cnpj }</h3>
                    <!-- Formulario para alteração de empresas -->
                    <form action="controller.do" method="post">
	            <!-- area de campos do form -->
	            <input type="hidden" name="cnpj_antigo" value="${empresa.cnpj }">
	            <div class="row">
	                <div class="form-group col-md-6">
	                    <label for="cnpj">CNPJ</label>
	                    <input type="number" class="form-control" name="cnpj" id="cnpj" value="${empresa.cnpj }" required maxlength="11" placeholder="Somente números">
	                </div>
	                <div class="form-group col-md-6">
	                    <label for="razaoSocial">Razão Social</label>
	                    <input type="text" class="form-control" name="razaoSocial" id="razaoSocial" value="${empresa.razaoSocial }" required maxlength="44" placeholder="Nome da Empresa">
	                </div>
	            </div>
	            <div class="row">
	                <div class="form-group col-md-6">
	                    <label for="conjunto">Conjunto</label>
	                    <input type="text" class="form-control" name="conjunto" id="conjunto" value="${empresa.conjunto }" required maxlength="1" placeholder="Uma letra (A-Z)">
	                </div>
	
	                <div class="form-group col-md-6">
	                    <label for="horarioFunc">Horário de Funcionamento</label>
	                    <input type="text" class="form-control" name="horarioFunc" id="horarioFunc" value="${empresa.horFunc }" required maxlength="11" placeholder="00:00-00:00">
	                </div>
	            </div>
	            <div class="row">
	                <div class="form-group col-md-6">
	                    <label for="horarioFuncAC">Horário de Funcionamento do Ar-Condicionado</label>
	                    <input type="text" class="form-control" name="horarioFuncAC" id="horarioFuncAC" value="${empresa.horFuncAC }" required maxlength="11" placeholder="00:00-00:00">
	                </div>
	                <div class="form-group col-md-6">
	                    <label for="tempMaxAC">Temperatura Máxima do Ar-Condicionado</label>
	                    <input type="number" class="form-control" name="tempMaxAC" id="tempMaxAC" value="${empresa.valorMaxAC }" required maxlength="2" placeholder="Temperatura em graus Celsius">
	                </div>
	            </div>
	            <hr />
	            <div id="actions" class="row">
	                <div class="col-md-12">
	                    <button type="submit" class="btn btn-primary" name="command" value="AlterarEmpresa">Salvar</button>
	                    <a href="ListarEmpresas.jsp" class="btn btn-default">Cancelar</a>
	                </div>
	            </div>
	        </form>
                </div>
                <script src="js/jquery.min.js"></script>
                <script src="js/bootstrap.min.js"></script>
        </body>

        </html>