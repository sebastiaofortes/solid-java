package com.sebastiaofortes.solidjava.violation;

public class OpenClosed {

    public void sendEmails(Email vendas, Email financas) {
        if(vendas.tipo == "HTML"){
            vendas.sendHtmlEmail();
        }
        else {
            vendas.sendTxtEmail();
        }

        if(financas.tipo == "HTML"){
            financas.sendHtmlEmail();
        }
        else {
            financas.sendTxtEmail();
        }
    }
}

class Email {
    public String tipo;
    public String corpo;
    public String destinatario;

    public void sendHtmlEmail(){

    }

    public void sendTxtEmail(){
        
    }
}