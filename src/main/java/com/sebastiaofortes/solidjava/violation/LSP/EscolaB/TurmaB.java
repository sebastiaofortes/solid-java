package com.sebastiaofortes.solidjava.violation.LSP.EscolaB;

import com.sebastiaofortes.solidjava.violation.LSP.Iturma;

import java.util.List;

public class TurmaB implements Iturma{
    private List<Aluno> alunos;

    public TurmaB(List<Aluno> alunos) {
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
