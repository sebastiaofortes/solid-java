package com.sebastiaofortes.solidjava.noviolation.DIP.factories;

import com.sebastiaofortes.solidjava.noviolation.DIP.ports.RepositoryInterface;
import com.sebastiaofortes.solidjava.noviolation.DIP.ports.ServiceInterface;

public interface EmailServiceFactory {
    ServiceInterface createEmailService(RepositoryInterface repository);
}
