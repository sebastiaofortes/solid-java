package com.sebastiaofortes.solidjava.violation.LSP;

import com.sebastiaofortes.solidjava.violation.LSP.EscolaA.Aluno;
import com.sebastiaofortes.solidjava.violation.LSP.EscolaA.TurmaA;

import java.util.ArrayList;
import java.util.List;

public class TestTurmaA{

    public void Test(String[] args) {
        Aluno aluno1 = new Aluno("João", "5");
        Aluno aluno2 = new Aluno("Maria", "6");
        Aluno aluno3 = new Aluno("Pedro", "7");

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);

        TurmaA turma = new TurmaA(alunos);

        Secretaria sec = new Secretaria();
        sec.adicionarTurma(turma);

        String resultado = sec.verificarAluno(0, "Maria");
        System.out.println("TurmaA: "+resultado);

    }

}