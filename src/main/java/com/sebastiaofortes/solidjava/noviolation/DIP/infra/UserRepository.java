package com.sebastiaofortes.solidjava.noviolation.DIP.infra;

import java.sql.Connection;
import com.sebastiaofortes.solidjava.noviolation.DIP.application.UserRepositoryInterface;
import com.sebastiaofortes.solidjava.noviolation.DIP.domain.User;

public class UserRepository implements UserRepositoryInterface{
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