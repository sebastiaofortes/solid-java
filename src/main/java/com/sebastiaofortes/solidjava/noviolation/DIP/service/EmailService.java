package com.sebastiaofortes.solidjava.noviolation.DIP.service;

import com.sebastiaofortes.solidjava.noviolation.DIP.ports.RepositoryInterface;
import com.sebastiaofortes.solidjava.noviolation.DIP.ports.ServiceInterface;

public class EmailService implements ServiceInterface {
    private RepositoryInterface repository;

    public EmailService(RepositoryInterface repository) {
        this.repository = repository;
    }

    @Override
    public void sendEmailToUser(String email, String message) throws Exception {
        try {
            repository.sendEmail(email, message);
        } catch (Exception e) {
            throw e;
        }
    }

    // Outros métodos e lógica relevante para a classe EmailService

    // Abstract Factory Example
    public static EmailService newEmailService(RepositoryInterface r) {
        return new EmailService(r);
    }
}