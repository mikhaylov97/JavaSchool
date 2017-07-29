package com.tsystems.app.dao.api;


import com.tsystems.app.model.User;

public interface UserDao {
    User findUserByEmail(String email);
}
