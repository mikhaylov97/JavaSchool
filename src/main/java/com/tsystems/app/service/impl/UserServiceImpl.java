package com.tsystems.app.service.impl;

import com.tsystems.app.dao.api.UserDao;
import com.tsystems.app.model.User;
import com.tsystems.app.service.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserByEmail(String email) {
        return userDao.findUserByEmail(email);
    }
}
