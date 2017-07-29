package com.tsystems.app.dao.impl;

import com.tsystems.app.dao.api.UserDao;
import com.tsystems.app.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class UserDaoImpl implements UserDao{

    @PersistenceContext
    EntityManager em;

    @Override
    public User findUserByEmail(String email) {
        return null;
    }
}
