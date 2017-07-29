package com.tsystems.app.service.api;


import com.tsystems.app.model.User;

public interface UserService {
    User getUserByEmail(String email);
}
