package com.sebastiaofortes.solidjava.noviolation.DIP.repository;

import com.sebastiaofortes.solidjava.noviolation.DIP.ports.RepositoryInterface;

public class EmailRepository implements RepositoryInterface {
    @Override
    public void sendEmail(String email, String message) throws Exception {
        // Lógica para enviar o email
        // Exemplo simplificado: imprimir os dados do email
        System.out.println("Sending email to: " + email);
        System.out.println("Message: " + message);

        // Pode lançar exceções se ocorrerem erros durante o envio
        // Exemplo: throw new EmailSendingException("Failed to send email");
    }

    // Outros métodos e lógica relevante para a classe EmailRepository
}