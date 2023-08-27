package com.sebastiaofortes.solidjava.noviolation.DIP.controller;

import com.sebastiaofortes.solidjava.noviolation.DIP.ports.ServiceInterface;

public class EmailController {
    private ServiceInterface service;
    // algum emissor de e-mail, caso necessário

    public EmailController(ServiceInterface service) {
        this.service = service;
        // inicializar o emissor de e-mail, se aplicável
    }

    // Abstract Factory Example
    public static EmailController newEmailController(ServiceInterface serv) {
        return new EmailController(serv);
    }

    public void sendEmailToUser(String email, String message) throws Exception {
        // Realizar validações, se necessário

        try {
            service.sendEmailToUser(email, message);
        } catch (Exception e) {
            throw e;
        }
    }

    // Outros métodos e lógica relevante para a classe EmailController
}