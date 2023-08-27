package com.sebastiaofortes.solidjava.noviolation.DIP.repository;

import com.sebastiaofortes.solidjava.noviolation.DIP.factories.EmailRepositoryFactory;
import com.sebastiaofortes.solidjava.noviolation.DIP.ports.RepositoryInterface;

public class DefaultEmailRepositoryFactory implements EmailRepositoryFactory {
    @Override
    public RepositoryInterface createEmailRepository() {
        // Aqui você retornaria uma instância real do repositório de email
        return new EmailRepository();
    }
}