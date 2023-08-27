package com.sebastiaofortes.solidjava.noviolation.DIP.service;

import com.sebastiaofortes.solidjava.noviolation.DIP.factories.EmailServiceFactory;
import com.sebastiaofortes.solidjava.noviolation.DIP.ports.RepositoryInterface;
import com.sebastiaofortes.solidjava.noviolation.DIP.ports.ServiceInterface;

public class DefaultEmailServiceFactory implements EmailServiceFactory {
    @Override
    public ServiceInterface createEmailService(RepositoryInterface repository) {
        return new EmailService(repository);
    }
}
