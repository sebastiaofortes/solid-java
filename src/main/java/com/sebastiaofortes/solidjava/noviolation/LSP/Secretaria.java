package com.sebastiaofortes.solidjava.noviolation.LSP;

import java.util.List;

public class Secretaria {
    private List<Iturma> turmas;

    public Secretaria(List<Iturma> turma) {
        this.turmas = turma;
    }

    public String verificarAluno(int t, String aluno) {
        try {
            double nota = turmas.get(t).obterNota(aluno);
            if (nota >= 6.0) {
                return "O aluno "+aluno+" foi aprovado.";
            } else {
                return "O aluno "+aluno+" não foi aprovado.";
            }
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}






