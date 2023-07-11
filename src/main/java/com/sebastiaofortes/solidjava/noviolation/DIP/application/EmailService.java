package com.sebastiaofortes.solidjava.noviolation.DIP.application;

import com.sebastiaofortes.solidjava.noviolation.DIP.ports.UserRepositoryInterface;

public class EmailService{

    private UserRepositoryInterface ur;

    public EmailService(UserRepositoryInterface ur) {
        this.ur = ur;
    }

    public void SendEmailToUser(Integer userId){
        ur.GetUserById(userId);
        //send email
    }
}
