package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class GerenciadorConexao {
	
	 private static Connection conexao;

	    /**
	        * Método estático para obtenção de conexão.
	        * 
	        * @return
	        */
	    public static Connection getConexao() {

	        if (conexao == null) {
	          String username = "root";
	          String password = "123456";
	          // Informa a URL do banco (siturb) e o timezone do servidor
	          String url = "jdbc:mysql://MacBook-Pro-de-Gustavo.local/siturb?serverTimezone=UTC";
	          try {
	                Class.forName("com.mysql.cj.jdbc.Driver");
	                conexao = DriverManager.getConnection(url, username, password);
	          } catch (Exception e) {
	                e.printStackTrace();
	          }
	        }
	    return conexao;
	    }

}
