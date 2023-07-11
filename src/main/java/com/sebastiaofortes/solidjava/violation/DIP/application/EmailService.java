package com.sebastiaofortes.solidjava.violation.DIP.application;

import com.sebastiaofortes.solidjava.violation.DIP.infra.UserRepository;

public class EmailService{
    private UserRepository ur;

    public EmailService(UserRepository ur) {
        this.ur = ur;
    }

    public void SendEmailToUser(Integer userId){
        ur.GetUserById(userId);
        //send email
    }
}
