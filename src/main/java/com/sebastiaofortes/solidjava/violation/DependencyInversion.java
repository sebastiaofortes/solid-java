package com.sebastiaofortes.solidjava.violation;

import java.sql.Connection;

public class DependencyInversion {
    
}

// camada de domínio
class User{
    public Integer Uid;
}

// camada de infraestrutura

class UserRepository {
    public Connection dbConnection;

    public UserRepository(Connection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public User GetUserById(Integer id) {
        User u = new User();
        // query user in database
        // save user data in u
        return u;
    }
}

// camada de aplicação

class EmailService{
    private UserRepository ur;

    public EmailService(UserRepository ur) {
        this.ur = ur;
    }

    public void SendEmailToUser(Integer userId){
        ur.GetUserById(userId);
        //send email
    }
}
