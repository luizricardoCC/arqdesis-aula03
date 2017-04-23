package service;

import dao.UsuarioDAO;
import javabean.UsuarioTO;

public class UsuarioService {
	private UsuarioDAO usuarioDAO = new UsuarioDAO();
	UsuarioTO usuarioTO;
	
	public boolean cadastrarUsuario(UsuarioTO uNovo) {
		if (usuarioDAO.cadastrarUsuario(uNovo))
			return true;
		else
			return false;
	}

	public UsuarioTO consultarUsuario(long cpf) {
		usuarioTO = usuarioDAO.consultarUsuario(cpf);
		return usuarioTO;
	}

	public boolean alterarUsuario(long cpf, UsuarioTO uNovo){
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
}
