package com.sebastiaofortes.solidjava.noviolation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DependencyInversion {

    DependencyInversion() throws SQLException {
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa?useSSL=false", "root", ""); 
        UserRepository ur = new UserRepository(cn);
        EmailService es = new EmailService(ur);
    }

    public void Test() throws SQLException {
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa?useSSL=false", "root", ""); 
        UserRepositoryMock Mock = new UserRepositoryMock(cn);
        EmailService es = new EmailService(Mock);  
    }

}

// camada de domínio
class User{
    public Integer Uid;
}

interface UserRepositoryInterface{
    User GetUserById(Integer id);
}

// camada de infraestrutura

class UserRepository implements UserRepositoryInterface{
    public Connection dbConnection;

    public UserRepository(Connection dbConnection) {
        this.dbConnection = dbConnection;
    }

    @Override
    public User GetUserById(Integer id) {
        User u = new User();
        // query user in database
        // save user data in u
        return u;
    }
}

class UserRepositoryMock implements UserRepositoryInterface{
    public Connection dbConnection;

    public UserRepositoryMock(Connection dbConnection) {
        this.dbConnection = dbConnection;
    }

    @Override
    public User GetUserById(Integer id) {
        User u = new User();
        // query user in database
        // save user data in u
        return u;
    }
}

// camada de aplicação

class EmailService{

    private UserRepositoryInterface ur;

    public EmailService(UserRepositoryInterface ur) {
        this.ur = ur;
    }

    public void SendEmailToUser(Integer userId){
        ur.GetUserById(userId);
        //send email
    }
}
