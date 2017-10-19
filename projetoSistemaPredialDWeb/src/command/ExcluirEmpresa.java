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

public class ExcluirEmpresa implements Command {

	@Override
	public void executar(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String pCnpj = request.getParameter("cnpj_excluir");
		long cnpj = -1;
		try {
			cnpj = Long.parseLong(pCnpj);
		} catch (NumberFormatException e) {

		}

		EmpresaService es = new EmpresaService();
		
		RequestDispatcher view = null;

		Empresa emp = es.consultar(cnpj);
		HttpSession session = request.getSession();

		es.excluir(cnpj);
		@SuppressWarnings("unchecked")
		ArrayList<Empresa> lista = null;
		session.setAttribute("lista", lista);
		view = request.getRequestDispatcher("ListarEmpresas.jsp");
		view.forward(request, response);

	}

}
