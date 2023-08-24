package com.sebastiaofortes.solidjava.noviolation.ISP;

interface IUsuario {
    String BuscarProdutos(String nome);
	Boolean AdicionarAoCarrinho(Integer idProduto);
	void FormaDePagamento(String forma);
}
