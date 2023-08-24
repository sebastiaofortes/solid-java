package com.sebastiaofortes.solidjava.noviolation.LSP;

import java.util.ArrayList;
import java.util.List;

import com.sebastiaofortes.solidjava.noviolation.LSP.EscolaA.Aluno;
import com.sebastiaofortes.solidjava.noviolation.LSP.EscolaA.Turma;

public class TestTurmaA{
    public void test() {
        Aluno aluno1 = new Aluno("João", "1");
        Aluno aluno2 = new Aluno("Maria", "4");
        Aluno aluno3 = new Aluno("Pedro", "3");

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);

        Turma turma = new Turma(alunos);

        Secretaria sec = new Secretaria(List.of(turma));
        String resultado = sec.verificarAluno(0, "Maria");
        System.out.println(resultado);

    }

}