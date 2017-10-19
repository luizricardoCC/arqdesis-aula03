package command;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import javabean.Empresa;
import service.EmpresaService;

public class ListarEmpresasBuscar implements Command {

	@Override
	public void executar(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String chave = request.getParameter("data[search]");
		EmpresaService empresa = new EmpresaService();
		ArrayList<Empresa> lista = null;
		Empresa 		   emp = null; 	
		HttpSession session = request.getSession();
		if (chave != null && chave.length() > 0) {
			long cnpj = Long.parseLong(chave);
			emp = empresa.consultar(cnpj);
			lista = new ArrayList<Empresa>(1);
			lista.add(emp);
		} else {
			lista = empresa.listar();
		}
		session.setAttribute("lista", lista);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("ListarEmpresas.jsp");
		dispatcher.forward(request, response);
	}
}
