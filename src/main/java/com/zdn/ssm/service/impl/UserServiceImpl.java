package com.zdn.ssm.service.impl;

import com.zdn.ssm.dao.UserDao;
import com.zdn.ssm.entity.User;
import com.zdn.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findNameAndPass(String name, String password) {
        return userDao.selectByNameAndPass(name, password);
    }
}
