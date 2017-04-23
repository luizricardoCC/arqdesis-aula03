package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import javabean.Empresa;
import service.EmpresaService;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmpresaServiceTest {
	EmpresaService test;
	Empresa enterprise, returnedEnterprise;
	long lastCNPJ;

	@Before
	public void setUp() throws Exception {
		
		test = new EmpresaService();
		enterprise = new Empresa(Long.parseLong("10000000001"), 
				"TestEnterprise", "ZZZ", "09:00 - 17:30", "10:00 - 17:30", 100);
		
	}
	
	@Test
	public void test00Consultar() {
		Empresa fixture = new Empresa(Long.parseLong("23997723700"), 
				"Ricardo Ltda", 
				"A", 
				"08:00 - 17:30", 
				"08:00 - 17:30", 
				20);
		
		returnedEnterprise = test.consultar( fixture.getCnpj() );
		
		assertEquals("Teste Consulta", fixture, returnedEnterprise);
	}

	@Test
	public void test01Cadastrar() {
		
		test.cadastrar(enterprise);
		returnedEnterprise = test.consultar(enterprise.getCnpj());
		
		assertEquals("Teste Cadastro", enterprise, returnedEnterprise);
	}

	@Test
	public void test02Alterar() {
		lastCNPJ = enterprise.getCnpj();
		
		enterprise.setCnpj( Long.parseLong("111000") ); 
		enterprise.setRazaoSocial("TestEmpresaAlterada");
		
		test.alterar(lastCNPJ, enterprise);
		
		returnedEnterprise = test.consultar(enterprise.getCnpj());
		
		assertEquals("Teste Alterar", enterprise, returnedEnterprise);
	}
	
	@Test
	public void test03Excluir() {
		lastCNPJ = enterprise.getCnpj();
		
		test.excluir( enterprise.getCnpj() );
		enterprise = new Empresa();
		
		returnedEnterprise = test.consultar(lastCNPJ);
		
		assertEquals("Teste Exclusão", enterprise, returnedEnterprise);
	}

}
