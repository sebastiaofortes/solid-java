package com.sebastiaofortes.solidjava.violation.LSP;

public class Main {
    public static void main(String[] args){
        TestTurmaA ta = new TestTurmaA();
        ta.Test(args);

        TestTurmaB tb = new TestTurmaB();
        tb.test(args);
    }
}
