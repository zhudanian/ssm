package com.zdn.ssm.service;

import com.zdn.ssm.entity.User;

public interface UserService {

    User findNameAndPass(String name, String password);
}
