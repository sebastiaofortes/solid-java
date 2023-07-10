package com.sebastiaofortes.solidjava.violation.ISP;

public interface UsuarioService{
    void BuscarProdutos(String nome);
	void AdicionarAoCarrinho(Integer idProduto);
	void FormaDePagamento(String forma);
}