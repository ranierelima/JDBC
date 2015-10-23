package java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HsqldbConexao {
	public static void main(String[] args) throws SQLException {
		Connection conexao = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/loja", "SA","");
		System.out.println("Conexão aberta");
		if(conexao.isValid(0))
			System.out.println("Conexão foi realizada e testada");
		else
			System.out.println("Existe um problema na Conexão.");
		Statement statement = conexao.createStatement();
		boolean resultado = statement.execute("select * from Produto");
		ResultSet resultSet = statement.getResultSet();
		while(resultSet.next()) {
		    int id = resultSet.getInt("id");
		    String nome = resultSet.getString("nome");
		    String descricao = resultSet.getString("descricao");
		    System.out.println(id);
		    System.out.println(nome);
		    System.out.println(descricao);
		}
		resultSet.close();
		statement.close();
	}
}
