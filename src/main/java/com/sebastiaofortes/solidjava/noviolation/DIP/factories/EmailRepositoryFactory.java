package com.sebastiaofortes.solidjava.noviolation.DIP.factories;

import com.sebastiaofortes.solidjava.noviolation.DIP.ports.RepositoryInterface;

public interface EmailRepositoryFactory {
    RepositoryInterface createEmailRepository();
}
