package com.sebastiaofortes.solidjava.noviolation.DIP.ports;

public interface ServiceInterface {
    void sendEmailToUser(String email, String message) throws Exception;
}