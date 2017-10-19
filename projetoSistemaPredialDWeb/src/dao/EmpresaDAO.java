package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

import connection.ConnectionFactory;
import javabean.Empresa;

public class EmpresaDAO {

	Connection conn = null;

	// Construtor Padrão
	public EmpresaDAO() {
		/* this(0,"","","","",-1); */

	}

	// Cadastrar no banco
	@SuppressWarnings("static-access")
	public boolean cadastrar( Empresa emp ) {
		
	      String sqlSelect = "INSERT INTO empresa( empresaCNPJ,"
                  									+ "empresaRazaoSocial,"
                  									+ "empresaConjunto,"
                  									+ "empresaHorarioFuncionamento,"
                  									+ "empresaHorarioFuncionamentoAC,"
                  									+ "empresaTempMaxAC)"
                  									+ "VALUES (?, ?, ?, ?, ?, ?)";
		

		PreparedStatement stm = null;
		
		try {
			conn = ConnectionFactory.obtemConexao();
			// conn.setAutoCommit(false);
			stm = conn.prepareStatement(sqlSelect);

			stm.setLong(1, emp.getCnpj());
			stm.setString(2, emp.getRazaoSocial());
			stm.setString(3, emp.getConjunto());
			stm.setString(4, emp.getHorFunc());
			stm.setString(5, emp.getHorFuncAC());
			stm.setInt(6, emp.getValorMaxAC());

			stm.execute();
			stm.close();

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	// Carregar do banco
	public Empresa carregar(long cnpj) {
		String sqlSelect = "SELECT * FROM empresa WHERE empresaCNPJ = ?";
		PreparedStatement stm = null;
		ResultSet rs = null;
		Empresa emp = new Empresa();
		
		try {
			conn = ConnectionFactory.obtemConexao();
			stm = conn.prepareStatement(sqlSelect);
			stm.setLong(1, cnpj);
			rs = stm.executeQuery();
			if (rs.next()) {
				emp.setCnpj(rs.getLong(1));
				emp.setRazaoSocial(rs.getString(2));
				emp.setConjunto(rs.getString(3));
				emp.setHorFunc(rs.getString(4));
				emp.setHorFuncAC(rs.getString(5));
				emp.setValorMaxAC(rs.getInt(6));
			}
			

		} catch (Exception e) {
			System.out.println("Erro na consulta");
		}
			return emp;
		
	}
	
	public ArrayList<Empresa> consultarTodasEmpresas(){
		
		String sqlSelect = "SELECT * FROM empresa";
		PreparedStatement stm = null;
		ResultSet rs = null;
		ArrayList<Empresa> listaEmpresas = new ArrayList<Empresa>();
		
		try {
			conn = ConnectionFactory.obtemConexao();
			stm = conn.prepareStatement(sqlSelect);
			rs = stm.executeQuery();
			while (rs.next()) {
				Empresa emp = new Empresa();
				emp.setCnpj(rs.getLong(1));
				emp.setRazaoSocial(rs.getString(2));
				emp.setConjunto(rs.getString(3));
				emp.setHorFunc(rs.getString(4));
				emp.setHorFuncAC(rs.getString(5));
				emp.setValorMaxAC(rs.getInt(6));
				listaEmpresas.add(emp);
			}
			

		} catch (Exception e) {
			System.out.println("Erro na consulta de todas as empresas");
		}
		return listaEmpresas;
	}

	// Carregar todos CNPJs do banco
	public String[] selectAllCNPJ() {
		ArrayList listaEmpresas = new ArrayList(1);
		String sqlSelect = "SELECT empresaCNPJ FROM empresa";
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			conn = ConnectionFactory.obtemConexao();
			stm = conn.prepareStatement(sqlSelect);
			rs = stm.executeQuery();
			while (rs.next()) {
				listaEmpresas.add(rs.getLong(1));
			}
		} catch (Exception e) {
			listaEmpresas.add(0);
		}

		String[] cnpjs = new String[listaEmpresas.size()];
		for (int i = 0; i < listaEmpresas.size(); i++) {
			cnpjs[i] = listaEmpresas.get(i).toString();
		}

		return cnpjs;
	}

	// Excluir do banco
	public boolean excluir(long cnpj) {
		String sqlSelect = "DELETE FROM empresa WHERE empresaCNPJ = ?";
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			conn = ConnectionFactory.obtemConexao();
			stm = conn.prepareStatement(sqlSelect);
			stm.setLong(1, cnpj);
			stm.executeUpdate();
			stm.close();
			return true;

		} catch (Exception j) {
			return false;
		}
	}

	// Alterar do banco
	public boolean alterar(long cnpj, Empresa emp) {
		
		String sqlSelect = "UPDATE empresa SET empresaCNPJ = ?, "
							+ "empresaRazaoSocial = ?, "
							+ "empresaConjunto = ?, "
							+ "empresaHorarioFuncionamento = ?, "
							+ "empresaHorarioFuncionamentoAC = ?, "
							+ "empresaTempMaxAC = ? "
							+ "WHERE empresaCNPJ = ?";
		
		PreparedStatement stm = null;
		/*System.out.println("Classe DAO");      			
      	System.out.println(emp.getCnpj());
      					System.out.println(emp.getRazaoSocial());
      					System.out.println(emp.getConjunto());
      					System.out.println(emp.getHorFunc());
      					System.out.println(emp.getHorFuncAC());
      					System.out.println(emp.getValorMaxAC());*/
		try {
			conn = ConnectionFactory.obtemConexao();
			stm = conn.prepareStatement(sqlSelect);
			stm.setLong(1, emp.getCnpj());
			stm.setString(2, emp.getRazaoSocial());
			stm.setString(3, emp.getConjunto());
			stm.setString(4, emp.getHorFunc());
			stm.setString(5, emp.getHorFuncAC());
			stm.setInt(6, emp.getValorMaxAC());
			stm.setLong(7, cnpj);
			stm.executeUpdate();
			stm.close();

			return true;
		} catch (Exception j) {

			System.out.println("Erro alterar");
			return false;
		}
	}

}