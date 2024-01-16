package com.sebastiaofortes.solidjava.violation.ISP;

public class Visitante implements UsuarioService{

    @Override
    public String BuscarProdutos(String nome) {
        // implementação de código aqui
        return "produto json";
    }

    @Override
    public Boolean AdicionarAoCarrinho(Integer idProduto) {
        // implementação de código aqui
        return true;
    }

    @Override
    public void FormaDePagamento(String forma) {
       
    }
    
}