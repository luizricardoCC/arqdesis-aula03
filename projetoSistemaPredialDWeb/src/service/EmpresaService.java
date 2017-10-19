package service;

import java.util.ArrayList;

import dao.EmpresaDAO;
import javabean.Empresa;

public class EmpresaService {
	EmpresaDAO empDAO = new EmpresaDAO();
	//Cadastrar
	   public boolean cadastrar(Empresa eNovo)
	   {
	      if(empDAO.cadastrar(eNovo)) 
	         return true;
	      else 
	         return false;
	      
	   }
	   
	   //Consultar
	   public Empresa consultar(long cnpj)
	   {
	      Empresa empTO = empDAO.carregar(cnpj); 
	      return empTO;
	   }
	   
	   //Listar
	   public ArrayList<Empresa> listar()
	   {
		  ArrayList<Empresa> lista = empDAO.consultarTodasEmpresas(); 
	      return lista;
	   }
	   
	   //Excluir
	   public boolean excluir(long cnpj)
	   {
	      if(empDAO.excluir(cnpj))
	      {
	         
	         return true;
	      }
	      else 
	         return false;
	   }
	   
	   //Alterar
	   public boolean alterar( long cnpj, Empresa eNovo)
	   {
		   EmpresaDAO empDAO3 = new EmpresaDAO();
		   /*System.out.println("Classe Service");      			
	      	System.out.println(empTO.getCnpj());
	      					System.out.println(empTO.getRazaoSocial());
	      					System.out.println(empTO.getConjunto());
	      					System.out.println(empTO.getHorFunc());
	      					System.out.println(empTO.getHorFuncAC());
	      					System.out.println(empTO.getValorMaxAC());*/
	        
		   if(empDAO3.alterar(cnpj, eNovo)) 
	         return true;
	      else 
	         return false;
	      
	   }

}
