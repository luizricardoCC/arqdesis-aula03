package service;

import dao.EmpresaDAO;
import transferObject.EmpresaTO;

public class EmpresaService {
	EmpresaDAO empDAO = new EmpresaDAO();
	//Cadastrar
	   public boolean cadastrar(EmpresaTO eNovo)
	   {
	      if(empDAO.cadastrar(eNovo)) 
	         return true;
	      else 
	         return false;
	      
	   }
	   
	   //Consultar
	   public EmpresaTO consultar(long cnpj)
	   {
	      EmpresaTO empTO = empDAO.carregar(cnpj); 
	      return empTO;
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
	   public boolean alterar( long cnpj, EmpresaTO eNovo)
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
