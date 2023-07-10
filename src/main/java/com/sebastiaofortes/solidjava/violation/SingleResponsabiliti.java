package com.sebastiaofortes.solidjava.violation;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SingleResponsabiliti {

}

class FuncionarioDao {
	private Connection connection;

	public ResultSet Listar() throws SQLException{
		// crio a conexao com o banco
		this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa?useSSL=false", "root", ""); 
		Statement stmt = this.connection.createStatement();
		// procuro dados no banco
		String sql = "SELECT 'name' FROM products";
		ResultSet rs = stmt.executeQuery(sql);
		// retorna uma lista de produtos
		return rs;
	}
}
