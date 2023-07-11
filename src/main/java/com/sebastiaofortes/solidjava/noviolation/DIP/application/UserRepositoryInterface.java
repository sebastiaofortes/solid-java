package com.sebastiaofortes.solidjava.noviolation.DIP.application;

import com.sebastiaofortes.solidjava.noviolation.DIP.domain.User;

public interface UserRepositoryInterface{
    User GetUserById(Integer id);
}