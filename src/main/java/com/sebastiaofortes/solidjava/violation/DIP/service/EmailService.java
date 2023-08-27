package com.sebastiaofortes.solidjava.violation.DIP.service;

import com.sebastiaofortes.solidjava.violation.DIP.repository.EmailRepository;

public class EmailService {
    private EmailRepository repository;

    public EmailService(EmailRepository repository) {
        this.repository = repository;
    }

    public void sendEmailToUser(String email, String message) {
        repository.sendEmail(email, message);
    }
}