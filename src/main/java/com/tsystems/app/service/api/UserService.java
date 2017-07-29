package com.tsystems.app.service.api;


import com.tsystems.app.model.Size;
import com.tsystems.app.model.User;

import java.util.Set;

public interface UserService {
    User getUserByEmail(String email);
    Set<Size> getSizes();
    void saveNewSize();
}
