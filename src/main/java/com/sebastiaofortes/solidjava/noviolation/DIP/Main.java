package com.sebastiaofortes.solidjava.noviolation.DIP;

import com.sebastiaofortes.solidjava.noviolation.DIP.controller.DefaultEmailControllerFactory;
import com.sebastiaofortes.solidjava.noviolation.DIP.controller.EmailController;
import com.sebastiaofortes.solidjava.noviolation.DIP.factories.EmailControllerFactory;
import com.sebastiaofortes.solidjava.noviolation.DIP.factories.EmailRepositoryFactory;
import com.sebastiaofortes.solidjava.noviolation.DIP.factories.EmailServiceFactory;
import com.sebastiaofortes.solidjava.noviolation.DIP.ports.RepositoryInterface;
import com.sebastiaofortes.solidjava.noviolation.DIP.ports.ServiceInterface;
import com.sebastiaofortes.solidjava.noviolation.DIP.repository.DefaultEmailRepositoryFactory;
import com.sebastiaofortes.solidjava.noviolation.DIP.service.DefaultEmailServiceFactory;

public class Main {
    public static void main(String[] args) {

        EmailRepositoryFactory repositoryFactory = new DefaultEmailRepositoryFactory();
        EmailServiceFactory serviceFactory = new DefaultEmailServiceFactory();
        EmailControllerFactory controllerFactory = new DefaultEmailControllerFactory();

        RepositoryInterface repository = repositoryFactory.createEmailRepository();
        ServiceInterface emailService = serviceFactory.createEmailService(repository);
        EmailController emailController = controllerFactory.createEmailController(emailService);

        // Agora você pode usar o emailController para enviar emails
    }
}




