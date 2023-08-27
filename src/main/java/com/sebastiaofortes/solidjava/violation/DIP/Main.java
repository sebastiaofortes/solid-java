package com.sebastiaofortes.solidjava.violation.DIP;

import com.sebastiaofortes.solidjava.violation.DIP.controller.EmailController;
import com.sebastiaofortes.solidjava.violation.DIP.repository.EmailRepository;
import com.sebastiaofortes.solidjava.violation.DIP.service.EmailService;

public class Main {
    public static void main(String[] args) {
        EmailRepository repository = new EmailRepository();
        EmailService service = new EmailService(repository);
        EmailController controller = new EmailController(service);
    }
}
