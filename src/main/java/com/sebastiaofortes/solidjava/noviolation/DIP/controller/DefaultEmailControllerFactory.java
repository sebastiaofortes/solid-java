package com.sebastiaofortes.solidjava.noviolation.DIP.controller;

import com.sebastiaofortes.solidjava.noviolation.DIP.factories.EmailControllerFactory;
import com.sebastiaofortes.solidjava.noviolation.DIP.ports.ServiceInterface;

public class DefaultEmailControllerFactory implements EmailControllerFactory {
    @Override
    public EmailController createEmailController(ServiceInterface service) {
        return new EmailController(service);
    }
}
