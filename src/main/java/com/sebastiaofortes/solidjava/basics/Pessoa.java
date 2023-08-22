package com.sebastiaofortes.solidjava.basics;

// Definindo um tipo chamado "Pessoa"
public class Pessoa {
    String nome;
    int idade;

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método associado ao tipo "Pessoa"
    void apresentar() {
        System.out.printf("Olá, eu sou %s e tenho %d anos.%n", nome, idade);
    }
}