package com.sebastiaofortes.solidjava.violation.LSP.EscolaB;

public class Aluno {
    private String nome;
    private String nota;
    private String sexo;


    public Aluno(String nome, String nota, String sexo) {
        this.nome = nome;
        this.nota = nota;
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public String getNome() {
        return nome;
    }

    public String getNota() {
        return nota;
    }
}
