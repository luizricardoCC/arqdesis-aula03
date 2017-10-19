package command;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javabean.Empresa;
import service.EmpresaService;

public class VisualizarEmpresa implements Command {

	@Override
	public void executar(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String pCnpj = request.getParameter("cnpj");
		long cnpj = -1;
		try {
			cnpj = Long.parseLong(pCnpj);
		} catch (NumberFormatException e) {

		}

		EmpresaService es = new EmpresaService();
		
		RequestDispatcher view = null;

		Empresa emp = es.consultar(cnpj);
		request.setAttribute("empresa", emp);
		view = request.getRequestDispatcher("VisualizarEmpresa.jsp");

		view.forward(request, response);

	}

}
