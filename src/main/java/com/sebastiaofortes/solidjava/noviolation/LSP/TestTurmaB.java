package com.sebastiaofortes.solidjava.noviolation.LSP;

import java.util.ArrayList;
import java.util.List;

import com.sebastiaofortes.solidjava.noviolation.LSP.EscolaB.Aluno;
import com.sebastiaofortes.solidjava.noviolation.LSP.EscolaB.Turma;

public class TestTurmaB{
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João", "A", "M");
        Aluno aluno2 = new Aluno("Maria", "B", "F");
        Aluno aluno3 = new Aluno("Pedro", "C", "M");

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);

        Turma turma = new Turma(alunos);

        try {
            double notaMaria = obterNotaAluno(turma, "Maria");
            System.out.println("Nota da Maria: " + notaMaria);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            double notaPedro = obterNotaAluno(turma, "Pedro");
            System.out.println("Nota do Pedro: " + notaPedro);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            double notaAna = obterNotaAluno(turma, "Ana");
            System.out.println("Nota da Ana: " + notaAna);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static double obterNotaAluno(Iturma turma, String nomeAluno) throws Exception {
        return turma.obterNota(nomeAluno);
    }
}