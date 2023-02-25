package com.sebastiaofortes.solidjava.violation;

public class InterfaceSegregation {
    
}

interface UsuarioService{
    void BuscarProdutos(String nome);
	void AdicionarAoCarrinho(Integer idProduto);
	void FormaDePagamento(String forma);
}

class UsuarioLogado implements UsuarioService{

    @Override
    public void BuscarProdutos(String nome) {
        // implementação de código aqui
    }

    @Override
    public void AdicionarAoCarrinho(Integer idProduto) {
        // implementação de código aqui
    }

    @Override
    public void FormaDePagamento(String forma) {
         // implementação de código aqui
    }

}

class Visitante implements UsuarioService{

    @Override
    public void BuscarProdutos(String nome) {
        // implementação de código aqui
    }

    @Override
    public void AdicionarAoCarrinho(Integer idProduto) {
    
    }

    @Override
    public void FormaDePagamento(String forma) {
       
    }
    
}