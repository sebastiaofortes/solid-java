package com.sebastiaofortes.solidjava.noviolation.OCP;

public class Sender {

    public void sendEmails(EmailDefault []emails) {

        // Open to extensions of the EmailDefault
        // This implementation can also be done with interfaces
        EmailTxt ed = new EmailTxt();
        sendAll(ed);

        /*
         for(EmailDefault em : emails){
                em.send();
        }
        */
    }

    public void sendAll(EmailDefault e) {
        e.send();
    }
}