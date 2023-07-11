package com.sebastiaofortes.solidjava.noviolation.DIP.ports;

import com.sebastiaofortes.solidjava.noviolation.DIP.domain.User;

public interface UserRepositoryInterface{
    User GetUserById(Integer id);
}