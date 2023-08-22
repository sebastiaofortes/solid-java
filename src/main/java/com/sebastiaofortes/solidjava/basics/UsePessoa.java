package com.sebastiaofortes.solidjava.basics;

public class UsePessoa {
    public void Usar(String[] args) {
        // Criando uma instância do tipo "Pessoa"
        Pessoa pessoa1 = new Pessoa("João", 30);

        // Chamando o método "apresentar" da instância "pessoa1"
        pessoa1.apresentar();
    }
}