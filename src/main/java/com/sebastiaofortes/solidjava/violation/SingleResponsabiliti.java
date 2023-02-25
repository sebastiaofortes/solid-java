package com.sebastiaofortes.solidjava.violation;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingleResponsabiliti {

}

class FuncionarioDao {
    private Integer id;
	private String nome;
	private Double salario;
	private Connection connection;

	public void salva() throws SQLException{
		this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa?useSSL=false", "root", ""); 
		Statement stmt = this.connection.createStatement();
		String sql = "insert into funcionario (id, nome, salario) values (" + this.id + "," +
				this.nome + "," + this.salario + ")";
		int rs = stmt.executeUpdate(sql);
		
		if (rs == 1){
			System.out.println("Funcionario inserido com sucesso.");
		}else if (rs == 0){
			System.out.println("Nenhum funcionario inserido.");
		}
	}
}
