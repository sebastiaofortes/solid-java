package com.sebastiaofortes.solidjava.violation.ISP;

public interface UsuarioService{
    String BuscarProdutos(String nome);
	Boolean AdicionarAoCarrinho(Integer idProduto);
	void FormaDePagamento(String forma);
}