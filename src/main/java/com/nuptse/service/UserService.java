package com.nuptse.service;

import com.nuptse.model.User;

public interface UserService {
    public User findUserByEmail(String email);
    public void saveUser(User user);
}
