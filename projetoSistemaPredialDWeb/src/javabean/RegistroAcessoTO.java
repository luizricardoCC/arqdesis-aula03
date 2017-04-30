package javabean;

public class RegistroAcessoTO {
	private String data, cpfUsuario, nomeUsuario, nomeEmpresa, horarioEntrada, horarioSaida;

	public RegistroAcessoTO(String data, String cpfUsuario, String nomeUsuario, String nomeEmpresa,
			String horarioEntrada, String horarioSaida) {
		this.data = data;
		this.cpfUsuario = cpfUsuario;
		this.nomeUsuario = nomeUsuario;
		this.nomeEmpresa = nomeEmpresa;
		this.horarioEntrada = horarioEntrada;
		this.horarioSaida = horarioSaida;
	}
	
	public RegistroAcessoTO(){
		this(null, null, null, null, null, null);
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getCpfUsuario() {
		return cpfUsuario;
	}

	public void setCpfUsuario(String cpfUsuario) {
		this.cpfUsuario = cpfUsuario;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getHorarioEntrada() {
		return horarioEntrada;
	}

	public void setHorarioEntrada(String horarioEntrada) {
		this.horarioEntrada = horarioEntrada;
	}

	public String getHorarioSaida() {
		return horarioSaida;
	}

	public void setHorarioSaida(String horarioSaida) {
		this.horarioSaida = horarioSaida;
	}

	@Override
	public String toString() {
		return "RegistroAcessoTO [getData()=" + getData() + ", getCpfUsuario()=" + getCpfUsuario()
				+ ", getNomeUsuario()=" + getNomeUsuario() + ", getNomeEmpresa()=" + getNomeEmpresa()
				+ ", getHorarioEntrada()=" + getHorarioEntrada() + ", getHorarioSaida()=" + getHorarioSaida() + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegistroAcessoTO other = (RegistroAcessoTO) obj;
		if (cpfUsuario == null) {
			if (other.cpfUsuario != null)
				return false;
		} else if (!cpfUsuario.equals(other.cpfUsuario))
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (horarioEntrada == null) {
			if (other.horarioEntrada != null)
				return false;
		} else if (!horarioEntrada.equals(other.horarioEntrada))
			return false;
		if (horarioSaida == null) {
			if (other.horarioSaida != null)
				return false;
		} else if (!horarioSaida.equals(other.horarioSaida))
			return false;
		if (nomeEmpresa == null) {
			if (other.nomeEmpresa != null)
				return false;
		} else if (!nomeEmpresa.equals(other.nomeEmpresa))
			return false;
		if (nomeUsuario == null) {
			if (other.nomeUsuario != null)
				return false;
		} else if (!nomeUsuario.equals(other.nomeUsuario))
			return false;
		return true;
	}
	
	
	
}
