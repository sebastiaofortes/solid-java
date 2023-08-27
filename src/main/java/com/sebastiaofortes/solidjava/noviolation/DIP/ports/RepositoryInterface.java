package com.sebastiaofortes.solidjava.noviolation.DIP.ports;
public interface RepositoryInterface {
    void sendEmail(String email, String message) throws Exception;
}
