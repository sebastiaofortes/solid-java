package com.sebastiaofortes.solidjava.violation.ISP;

class UsuarioLogado implements UsuarioService{

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

    @Override
    public void FormaDePagamento(String forma) {
         // implementação de código aqui
    }

}
