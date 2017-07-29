package com.tsystems.app.service.impl;

import com.tsystems.app.dao.api.UserDao;
import com.tsystems.app.model.Size;
import com.tsystems.app.model.User;
import com.tsystems.app.service.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserByEmail(String email) {
        return userDao.findUserByEmail(email);
    }

    @Override
    public Set<Size> getSizes() {
        return userDao.getAvailableSizesOfProduct();
    }

    @Override
    @Transactional
    public void saveNewSize() {
        Size size = new Size("46", "1", "+700");
        userDao.saveNewSizeToBase(size);
    }
}
