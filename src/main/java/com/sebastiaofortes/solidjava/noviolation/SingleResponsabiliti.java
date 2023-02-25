package com.sebastiaofortes.solidjava.noviolation;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingleResponsabiliti {

}

class FuncionarioDAO {

	private Connection connection;

	FuncionarioDAO() throws SQLException{
		this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa?useSSL=false", "root", ""); 
	}

    public void salvar(String nome, Integer id, Double salario) throws SQLException{
		Statement stmt = this.connection.createStatement();
		String sql = "insert into funcionario (id, nome, salario) values (" + id + "," +
				nome + "," + salario + ")";
		int rs = stmt.executeUpdate(sql);
		
		if (rs == 1){
			System.out.println("Funcionario inserido com sucesso.");
		}else if (rs == 0){
			System.out.println("Nenhum funcionario inserido.");
		}
	}
}
