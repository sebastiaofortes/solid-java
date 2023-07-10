package com.sebastiaofortes.solidjava.noviolation.SRP;

public class ProdutoService {
    // Método para calcular o valor total da compra
    public double calcularValorCompra(String nomeProduto, int quantidade) {
        ProdutoDAO produtoDAO = new ProdutoDAO();
        double precoProduto = produtoDAO.buscarPrecoProduto(nomeProduto);

        if (precoProduto > 0) {
            return precoProduto * quantidade;
        } else {
            return 0.0;
        }
    }
}