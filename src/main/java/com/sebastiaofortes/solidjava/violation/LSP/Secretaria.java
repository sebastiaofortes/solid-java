package com.sebastiaofortes.solidjava.violation.LSP;

import java.util.ArrayList;
import java.util.List;

public class Secretaria{
    private List<Iturma> turmas = new ArrayList<>();

    public void adicionarTurma(Iturma turma) {
        this.turmas.add(turma);
    }

    public String verificarAluno(int t, String aluno) {
        try {
            String nota = turmas.get(t).obterNota(aluno);
            double aprovado = converterNota(nota);
            if (aprovado >= 6.0) {
                return "O aluno foi aprovado.";
            } else {
                return "O aluno não foi aprovado.";
            }
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    private double converterNota(String nota) throws Exception {
        try {
            return Double.parseDouble(nota);
        } catch (NumberFormatException e) {
            throw new Exception("[Secretaria:converterNota] Erro na conversão: " + e.getMessage());
        }
    }
}

