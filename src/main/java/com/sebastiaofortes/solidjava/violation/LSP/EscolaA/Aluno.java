package com.sebastiaofortes.solidjava.violation.LSP.EscolaA;

public class Aluno {
    private String nome;
    private String nota;

    public Aluno(String nome, String nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public String getNota() {
        return nota;
    }
}
