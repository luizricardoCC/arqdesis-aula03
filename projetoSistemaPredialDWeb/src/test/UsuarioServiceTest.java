package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import javabean.Usuario;
import service.UsuarioService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UsuarioServiceTest {
	UsuarioService test;
	Usuario user, returnedUser;
	long lastCPF;
	
	@Before
	public void setUp() throws Exception {
		
		test = new UsuarioService();
		user = new Usuario(0, 
				"TestUser",
				"1999-12-30", 
				"Endereço00", 
				"Bairro00", 
				Long.parseLong("1100001111"),
				"Senha00", 
				"00000000000", 
				"00:00", 
				"00:30", 
				Long.parseLong("00011100011"), 
				false);
		
	}

	@Test
	public void test00ConsultarUsuario() {
		Usuario fixture;
		
		fixture = new Usuario(0, 
				"Ricardo",
				"1990-03-25", 
				"Endereço1", 
				"Bairro1", 
				Long.parseLong("1111112222"),
				"Senha1", 
				"23997723700", 
				"08:00", 
				"17:30", 
				Long.parseLong("11111111111"), 
				false);
		returnedUser = test.consultarUsuario( fixture.getCpf() );

		assertEquals("Testando Consulta", fixture, returnedUser);
	}
	
	@Test
	public void test01CadastrarUsuario() {
		
		test.cadastrarUsuario(user);
		returnedUser = test.consultarUsuario(user.getCpf());
		
		assertEquals("Teste cadastro", user, returnedUser);
	}

	@Test
	public void test02AlterarUsuario() {
		lastCPF = user.getCpf();
		user.setNome("TestAlterado");
		test.alterarUsuario(lastCPF, user);
		
		returnedUser = test.consultarUsuario( user.getCpf() );
		
		assertEquals("Teste Alteração", user, returnedUser);
	}

	@Test
	public void test03ExcluirUsuario() {
		lastCPF = user.getCpf();
		test.excluirUsuario(user.getCpf());
		
		user = new Usuario();
		returnedUser = test.consultarUsuario(lastCPF);
		
		assertEquals("Teste Exclusão", user, returnedUser);
	}

}
