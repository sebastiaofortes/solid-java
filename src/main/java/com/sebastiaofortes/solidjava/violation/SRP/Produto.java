package com.sebastiaofortes.solidjava.violation.SRP;

import java.sql.*;

public class Produto {
    // Método para buscar o preço de um produto no banco MySQL
    public double buscarPrecoProduto(String nomeProduto) {
        // Configuração da conexão com o banco de dados
        String url = "jdbc:mysql://localhost:3306/seu_banco_de_dados";
        String user = "seu_usuario";
        String password = "sua_senha";
        
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        try {
            // Estabelecendo conexão com o banco de dados
            connection = DriverManager.getConnection(url, user, password);
            
            // Criando uma declaração SQL
            statement = connection.createStatement();
            
            // Executando a consulta para buscar o preço do produto
            String query = "SELECT preco FROM produtos WHERE nome = '" + nomeProduto + "'";
            resultSet = statement.executeQuery(query);
            
            // Verificando se o produto foi encontrado
            if (resultSet.next()) {
                return resultSet.getDouble("preco");
            } else {
                System.out.println("Produto não encontrado.");
                return 0.0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return 0.0;
        } finally {
            // Fechando as conexões e liberando recursos
            try {
                if (resultSet != null)
                    resultSet.close();
                if (statement != null)
                    statement.close();
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    // Método para calcular o valor total da compra
    public double calcularValorCompra(String nomeProduto, int quantidade) {
        double precoProduto = buscarPrecoProduto(nomeProduto);
        
        if (precoProduto > 0) {
            return precoProduto * quantidade;
        } else {
            return 0.0;
        }
    }
}
