package com.javi.userapi.service;

import com.javi.userapi.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);
    void deleteUser(User user);
    List<User> findAll();
    User findById(Long id);
    User findByUser(User user);
}
