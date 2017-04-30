package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javabean.Empresa;
import service.EmpresaService;

/**
 * Servlet implementation class ManterEmpresaController
 */
@WebServlet("/ManterEmpresa.do")
public class ManterEmpresaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		long	formCnpj 		= Long.parseLong( request.getParameter("txtCNPJ") );
		String	formRazaoSocial	= request.getParameter("txtRazao");
		String	formConjunto	= request.getParameter("txtConjunto");
		String	formHorFunc		= request.getParameter("txtHrFunc");
		int		formTempMaxAC	= Integer.parseInt( request.getParameter("txtTempMaxAC") );
		String	formHorFuncAC	= request.getParameter("txtHrFuncAC");
		
		//javabean
		Empresa emp = new Empresa( formCnpj, 
				formRazaoSocial, 
				formConjunto, 
				formHorFunc, 
				formHorFuncAC, 
				formTempMaxAC);
		
		EmpresaService es = new EmpresaService();
		es.cadastrar(emp);
		
		emp = es.consultar(formCnpj);
		
		request.setAttribute("empresa", emp);
		
		RequestDispatcher view = request.getRequestDispatcher("Empresa.jsp");
		view.forward(request, response);
		
	}

}
