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

public class EditarEmpresa implements Command {

	@Override
	public void executar(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String pCnpj = request.getParameter("cnpj");
		long   cnpj = -1;
		try {
			cnpj = Long.parseLong(pCnpj);
		} catch (NumberFormatException e) {

		}

		EmpresaService es = new EmpresaService();
		
		RequestDispatcher view = null;
		HttpSession session = request.getSession();
		
		Empresa empresa = es.consultar(cnpj);
		request.setAttribute("empresa", empresa);
		view = request.getRequestDispatcher("EditarEmpresa.jsp");		
		
		view.forward(request, response);

	}

}
