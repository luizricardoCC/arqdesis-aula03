package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import javabean.RegistroAcessoTO;
import service.RegistroAcessoService;


public class RegistroAcessoServiceTest {

	private RegistroAcessoService ras;
	private long login;
	private String senha;
	RegistroAcessoTO rATO = new RegistroAcessoTO();
	RegistroAcessoTO returned;
	
	@Before
	public void setUp() throws Exception {
	
		ras = new RegistroAcessoService();
		login = Long.parseLong("11111111111");
		senha = "Senha1";
		
		rATO.setCpfUsuario( String.valueOf(login) );
		rATO.setNomeUsuario("Ricardo");
		rATO.setNomeEmpresa("23997723700");
		rATO.setHorarioSaida("");
	
	}
	
	@Test
	public void testEntrar() throws Exception{
		ras.entrar(login, senha);
		returned = ras.consultar(login);
		
		rATO.setData(returned.getData());
		rATO.setHorarioEntrada(returned.getHorarioEntrada());
		
		
		assertEquals("Teste entrar catraca", rATO, returned);
		
	}

	/*@Test
	public void testSair() {
		fail("Not yet implemented");
	}

	@Test
	public void testConsultarPorEmpresa() {
		fail("Not yet implemented");
	}

	@Test
	public void testConsultarPorData() {
		fail("Not yet implemented");
	}*/

}
