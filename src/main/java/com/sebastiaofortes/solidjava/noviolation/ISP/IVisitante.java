package com.sebastiaofortes.solidjava.noviolation.ISP;

interface IVisitante {
    String BuscarProdutos(String nome);
    Boolean AdicionarAoCarrinho(Integer idProduto);
}