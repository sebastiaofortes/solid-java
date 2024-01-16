package com.sebastiaofortes.solidjava.noviolation.LSP.EscolaB;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sebastiaofortes.solidjava.noviolation.LSP.Iturma;

public class TurmaB implements Iturma{
    private List<Aluno> alunos;

    public TurmaB(List<Aluno> alunos) {
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

    private double converterNota(String nota) throws Exception {
        Map<String, Double> dataMap = new HashMap<>();
        dataMap.put("A", 10.00);
        dataMap.put("B", 8.00);
        dataMap.put("C", 6.00);
        dataMap.put("D", 4.00);
        dataMap.put("E", 2.00);
        dataMap.put("F", 0.00);

        if (!dataMap.containsKey(nota)) {
            throw new Exception("Nota correspondente não encontrada");
        }

        return dataMap.get(nota);
    }
}