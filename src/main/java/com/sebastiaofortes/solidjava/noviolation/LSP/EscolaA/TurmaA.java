package com.sebastiaofortes.solidjava.noviolation.LSP.EscolaA;

import java.util.List;

import com.sebastiaofortes.solidjava.noviolation.LSP.Iturma;

public class TurmaA implements Iturma{
    private List<Aluno> alunos;

    public TurmaA(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public double obterNota(String nomeAluno) throws Exception {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equals(nomeAluno)) {
                return converterNota(aluno.getNota());
            }
        }
        throw new Exception("Aluno '" + nomeAluno + "' não encontrado na turma");
    }

    private double converterNota(String nota) throws NumberFormatException {
        return Double.parseDouble(nota);
    }
}
