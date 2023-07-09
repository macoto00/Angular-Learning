package com.example.logindandregistration.services;

import com.example.logindandregistration.models.User;

public interface UserService {
    void initRoleAndUser();
    User registerNewUser(User user);
    String getEncodedPassword(String password);
}
