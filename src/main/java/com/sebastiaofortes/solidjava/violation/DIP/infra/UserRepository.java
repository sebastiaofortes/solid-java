package com.sebastiaofortes.solidjava.violation.DIP.infra;

import java.sql.Connection;

import com.sebastiaofortes.solidjava.violation.DIP.domain.User;

public class UserRepository {
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