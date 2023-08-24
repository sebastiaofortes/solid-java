package com.sebastiaofortes.solidjava.noviolation.ISP;

public class Visitante implements IVisitante {

    @Override
    public String BuscarProdutos(String nome) {
        // implementação de código aqui
        return "product json";
    }

    @Override
    public Boolean AdicionarAoCarrinho(Integer idProduto) {
        // implementação de código aqui
        return true;
    }
}