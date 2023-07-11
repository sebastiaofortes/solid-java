package com.sebastiaofortes.solidjava.noviolation.DIP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.sebastiaofortes.solidjava.noviolation.DIP.application.EmailService;
import com.sebastiaofortes.solidjava.noviolation.DIP.infra.UserRepository;
import com.sebastiaofortes.solidjava.noviolation.DIP.infra.UserRepositoryMock;

public class Tests {

    public void TestUsingDependency() throws SQLException {
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa?useSSL=false", "root", ""); 
        UserRepository ur = new UserRepository(cn);
        EmailService es = new EmailService(ur);
    }

    public void TestUsingMock() throws SQLException {
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa?useSSL=false", "root", ""); 
        UserRepositoryMock Mock = new UserRepositoryMock(cn);
        EmailService es = new EmailService(Mock);  
    }

}