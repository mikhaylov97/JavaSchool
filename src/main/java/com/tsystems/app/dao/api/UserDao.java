package com.tsystems.app.dao.api;


import com.tsystems.app.model.Size;
import com.tsystems.app.model.User;

import java.util.Set;

public interface UserDao {
    User findUserByEmail(String email);
    Set<Size> getAvailableSizesOfProduct();
    void saveNewSizeToBase(Size size);
}
