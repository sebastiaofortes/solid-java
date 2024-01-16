package com.sebastiaofortes.solidjava.noviolation.OCP;

public class Sender {

    public void sendEmails(DefaultEmail[]emails) {

        for(DefaultEmail em : emails){
                em.send();
        }

    }

}