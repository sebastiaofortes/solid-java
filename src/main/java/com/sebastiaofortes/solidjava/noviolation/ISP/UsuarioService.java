package com.sebastiaofortes.solidjava.noviolation.ISP;

interface UsuarioService{
    void BuscarProdutos(String nome);
	void AdicionarAoCarrinho(Integer idProduto);
	void FormaDePagamento(String forma);
}
