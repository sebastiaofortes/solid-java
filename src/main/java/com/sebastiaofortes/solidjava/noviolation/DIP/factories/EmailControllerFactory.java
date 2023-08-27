package com.sebastiaofortes.solidjava.noviolation.DIP.factories;

import com.sebastiaofortes.solidjava.noviolation.DIP.controller.EmailController;
import com.sebastiaofortes.solidjava.noviolation.DIP.ports.ServiceInterface;

public interface EmailControllerFactory {
    EmailController createEmailController(ServiceInterface service);
}
