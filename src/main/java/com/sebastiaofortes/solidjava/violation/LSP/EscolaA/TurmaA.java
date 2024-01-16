package com.sebastiaofortes.solidjava.violation.LSP.EscolaA;

import java.util.List;

import com.sebastiaofortes.solidjava.violation.LSP.Iturma;

public class TurmaA implements Iturma{
    private List<Aluno> alunos;

    public TurmaA(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public String obterNota(String nomeAluno) throws Exception {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equals(nomeAluno)) {
                return aluno.getNota();
            }
        }
        throw new Exception("Aluno '" + nomeAluno + "' não encontrado na turma");
    }
}
