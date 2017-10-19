package service;

import dao.UsuarioDAO;
import javabean.Usuario;

public class UsuarioService {
	private UsuarioDAO usuarioDAO = new UsuarioDAO();
	Usuario usuarioTO;
	
	public boolean cadastrarUsuario(Usuario uNovo) {
		if (usuarioDAO.cadastrarUsuario(uNovo))
			return true;
		else
			return false;
	}

	public Usuario consultarUsuario(long cpf) {
		usuarioTO = usuarioDAO.consultarUsuario(cpf);
		return usuarioTO;
	}

	public boolean alterarUsuario(long cpf, Usuario uNovo){
		if (usuarioDAO.alterarUsuario(cpf, uNovo))
			return true;
		else
			return false;
	}

	public boolean excluirUsuario(long cpf) {
		if (usuarioDAO.excluirUsuario(cpf))
			return true;
		else
			return false;
	}
	
	public boolean validar(Usuario u) {
		if (usuarioDAO.validar(u))
			return true;
		else
			return false;
	}
}
