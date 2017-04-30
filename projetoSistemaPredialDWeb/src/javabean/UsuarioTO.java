package javabean;

public class UsuarioTO {
	private String nome, dataNasc, endereco, bairro, senha, empresa, horEntrada, horSaida;
	private int tipo;
	private long cpf, telefone;
	private boolean permissaoAC;

	// Construtor Padrão
	public UsuarioTO() {
		this(-1, null, null, null, null, -1, null, null, null, null, -1, true);
	}

	// Construtor Parametrizado
	public UsuarioTO(int tipo, String nome, String dataNasc, String endereco, String bairro, long telefone,
			String senha, String empresa, String horEntrada, String horSaida, long cpf, boolean permissaoAC) {
		setTipo(tipo);
		setNome(nome);
		setDataNasc(dataNasc);
		setEndereco(endereco);
		setBairro(bairro);
		setTelefone(telefone);
		setSenha(senha);
		setEmpresa(empresa);
		setHorEntrada(horEntrada);
		setHorSaida(horSaida);
		setCpf(cpf);
		setPermissaoAC(permissaoAC);
	}

	// Get's e Set's
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getTipo() {
		return tipo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getSenha() {
		return senha;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setHorEntrada(String horEntrada) {
		this.horEntrada = horEntrada;
	}

	public String getHorEntrada() {
		return horEntrada;
	}

	public void setHorSaida(String horSaida) {
		this.horSaida = horSaida;
	}

	public String getHorSaida() {
		return horSaida;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public long getCpf() {
		return cpf;
	}

	public void setPermissaoAC(boolean permissaoAC) {
		this.permissaoAC = permissaoAC;
	}

	public boolean getPermissaoAC() {
		return permissaoAC;
	}
	
	@Override
	public String toString() {
		return "Usuario [CPF=" + cpf 
				+ ", Tipo=" + tipo 
				+ ", Nome=" + nome 
				+ ", Data de Nascimento" + dataNasc
				+ ", Endereço=" + endereco 
				+ ", Bairro=" + bairro
				+ ", Telefone=" + telefone
				+ ", Senha=" + senha
				+ ", Empresa=" + empresa
				+ ", Horário de Acesso=" + horEntrada + "-" + horSaida
				+ ", Permissão Ar-Condicionado=" + permissaoAC
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioTO other = (UsuarioTO) obj;
		if (bairro == null) {
			if (other.bairro != null)
				return false;
		} else if (!bairro.equals(other.bairro))
			return false;
		if (cpf != other.cpf)
			return false;
		if (dataNasc == null) {
			if (other.dataNasc != null)
				return false;
		} else if (!dataNasc.equals(other.dataNasc))
			return false;
		if (empresa == null) {
			if (other.empresa != null)
				return false;
		} else if (!empresa.equals(other.empresa))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (horEntrada == null) {
			if (other.horEntrada != null)
				return false;
		} else if (!horEntrada.equals(other.horEntrada))
			return false;
		if (horSaida == null) {
			if (other.horSaida != null)
				return false;
		} else if (!horSaida.equals(other.horSaida))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (permissaoAC != other.permissaoAC)
			return false;
		if (senha == null) {
			if (other.senha != null)
				return false;
		} else if (!senha.equals(other.senha))
			return false;
		if (telefone != other.telefone)
			return false;
		if (tipo != other.tipo)
			return false;
		return true;
	}

}
