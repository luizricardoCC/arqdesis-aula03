package controller;

import java.io.IOException;
import java.io.PrintWriter;

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
		String resultado= "";
		if( es.cadastrar(emp))
		{
			resultado = "Empresa cadastrada com sucesso!";
		}
		else{
			resultado = "Erro no cadastro da Empresa";
		}
		
		emp = es.consultar(formCnpj);
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>"+resultado+"</title></head><body>");
		out.println(	"CNPJ: "+emp.getCnpj()+"<br>");
		out.println(	"Razão Social: "+emp.getRazaoSocial()+"<br>");
		out.println(	"Conjunto: "+emp.getConjunto()+"<br>");
		out.println(	"Horário Funcionamento: "+emp.getHorFunc()+"<br>");
		out.println(	"Horário Funcionamento AC: "+emp.getHorFuncAC()+"<br>");
		out.println(	"Temperatura Máxima AC: "+emp.getValorMaxAC()+"<br>");
	    out.println("</body></html>");
	}

}
