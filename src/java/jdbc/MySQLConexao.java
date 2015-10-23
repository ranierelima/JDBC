package java.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class MySQLConexao {

	public static void main(String[] args) throws SQLException,
			ClassNotFoundException {
		String driverName = "com.mysql.jdbc.Driver";
		Class.forName(driverName);
		String serverName = "localhost";
		String mydatabase = "loja";
		String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
		String username = "root";
		String password = "";
		java.sql.Connection conexao = DriverManager.getConnection(url,
				username, password);
		String status;
		if (conexao != null) {
			status = ("STATUS--->Conectado com sucesso!");
		} else {
			status = ("STATUS--->Não foi possivel realizar conexão");
		}

	}
}