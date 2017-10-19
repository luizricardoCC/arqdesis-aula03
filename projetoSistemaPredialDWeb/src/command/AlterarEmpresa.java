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

public class AlterarEmpresa implements Command {

	@Override
	public void executar(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		long	cnpjAntigo = Long.parseLong( request.getParameter("cnpj_antigo") );
		String pCnpj = request.getParameter("cnpj");
		String razaoSocial = request.getParameter("razaoSocial");
		String conjunto = request.getParameter("conjunto");
		String horFunc = request.getParameter("horarioFunc");
		String horFuncAC = request.getParameter("horarioFuncAC");
		int	   tempMaxAC = Integer.parseInt( request.getParameter("tempMaxAC") );
		long   cnpj = -1;
		try {
			cnpj = Long.parseLong(pCnpj);
		} catch (NumberFormatException e) {

		}

		Empresa empresa = new Empresa();
		empresa.setCnpj(cnpj);
		empresa.setRazaoSocial(razaoSocial);
		empresa.setConjunto(conjunto);
		empresa.setHorFunc(horFunc);
		empresa.setHorFuncAC(horFuncAC);
		empresa.setValorMaxAC(tempMaxAC);
		EmpresaService es = new EmpresaService();

		RequestDispatcher view = null;
		HttpSession session = request.getSession();

		es.alterar(cnpjAntigo, empresa);
		ArrayList<Empresa> lista = null;
		//lista.add(cliente);
		session.setAttribute("lista", lista);
		view = request.getRequestDispatcher("ListarEmpresas.jsp");

		view.forward(request, response);

	}


}
