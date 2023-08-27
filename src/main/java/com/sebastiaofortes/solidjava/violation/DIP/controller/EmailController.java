package com.sebastiaofortes.solidjava.violation.DIP.controller;

import com.sebastiaofortes.solidjava.violation.DIP.service.EmailService;

public class EmailController {
    private EmailService service;
    // algum email sender

    public EmailController(EmailService service) {
        this.service = service;
    }

    public void sendEmailToUser(String email, String message) {
        // validações
        service.sendEmailToUser(email, message);
    }
}