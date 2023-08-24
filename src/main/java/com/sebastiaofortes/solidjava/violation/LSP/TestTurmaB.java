package com.sebastiaofortes.solidjava.violation.LSP;

import java.util.ArrayList;
import java.util.List;

import com.sebastiaofortes.solidjava.violation.LSP.EscolaB.Aluno;
import com.sebastiaofortes.solidjava.violation.LSP.EscolaB.Turma;

public class TestTurmaB{
    public void test(String[] args) {
        Aluno aluno1 = new Aluno("João", "A", "M");
        Aluno aluno2 = new Aluno("Maria", "B", "F");
        Aluno aluno3 = new Aluno("Pedro", "C", "M");

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);

        Turma turma = new Turma(alunos);

        Secretaria sec = new Secretaria();
        sec.adicionarTurma(turma);

        String resultado = sec.verificarAluno(0, "Maria");
        System.out.println(resultado);
    }
}