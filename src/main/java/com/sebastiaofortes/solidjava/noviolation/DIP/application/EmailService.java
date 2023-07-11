package com.sebastiaofortes.solidjava.noviolation.DIP.application;

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
