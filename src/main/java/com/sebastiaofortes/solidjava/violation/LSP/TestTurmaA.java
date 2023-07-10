package com.sebastiaofortes.solidjava.violation.LSP;

import java.util.ArrayList;
import java.util.List;

import com.sebastiaofortes.solidjava.violation.LSP.EscolaA.Aluno;
import com.sebastiaofortes.solidjava.violation.LSP.EscolaA.Turma;

public class TestTurmaA{

    public void Test(String[] args) {
        Aluno aluno1 = new Aluno("João", "A");
        Aluno aluno2 = new Aluno("Maria", "B");
        Aluno aluno3 = new Aluno("Pedro", "C");

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

    private double convertToDouble(String input) throws NumberFormatException {
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Não foi possível converter a string para um número double");
        }
    }

    public double obterNotaAluno(Iturma turma, String nomeAluno) throws Exception {
        String nota = turma.obterNota(nomeAluno);
        double notaF = this.convertToDouble(nota);
        return notaF;
    }
}