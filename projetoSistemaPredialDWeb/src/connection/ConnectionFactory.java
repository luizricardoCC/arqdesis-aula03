package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
* Classe respons�vel pela conex�o com banco de dados MySQL
*/
public class ConnectionFactory
{
// -----------------------------------------------------------
// Carrega driver JDBC
//
   static
   {
      try
      {
         Class.forName("com.mysql.jdbc.Driver");
      }
      catch (ClassNotFoundException e)
      {
         throw new RuntimeException(e);
      }
   }

// -----------------------------------------------------------
// Obt�m conex�o com o banco de dados
   public static Connection obtemConexao() throws SQLException
   {
      return DriverManager.getConnection
         (
         "jdbc:mysql://localhost/sistema_predial?user=root&password=1234"
         );
   }
}