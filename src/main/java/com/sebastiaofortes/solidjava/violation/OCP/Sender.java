package com.sebastiaofortes.solidjava.violation.OCP;

public class Sender{

    public void sendEmails(HTMLEmail vendas, TxtEmail financas) {

        vendas.sendTxtEmail();
        financas.sendTxtEmail();

    }
}

class HTMLEmail {
    public String tipo;
    public String corpo;
    public String destinatario;

    public void sendHtmlEmail(){

    }

    public void sendTxtEmail(){
        
    }
}

class TxtEmail {
    public String tipo;
    public String corpo;
    public String destinatario;

    public void sendHtmlEmail(){

    }

    public void sendTxtEmail(){

    }
}