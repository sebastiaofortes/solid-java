package com.sebastiaofortes.solidjava.noviolation;

public class OpenClosed {

    public void sendEmails(EmailDefault []emails) {

        // Open to extensions of the EmailDefault
        // This implementation can also be done with interfaces
        //EmailTxt ed = new EmailTxt();
        //sendAll(ed);

        for(EmailDefault em : emails){
                em.send();    
        }
    }

    private void sendAll(EmailDefault e) {
        e.send();
    }
}

class EmailDefault {
    public String tipo;
    public String corpo;
    public String destinatario;

    public void send(){
        //codigo
    }
}

class EmailTxt extends EmailDefault {
    @Override
    public void send(){
        //send in txt mode
    }
}