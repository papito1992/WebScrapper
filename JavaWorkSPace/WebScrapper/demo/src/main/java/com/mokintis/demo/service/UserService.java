package com.mokintis.demo.service;


import com.mokintis.demo.model.User;

public interface UserService {
    void save(User user);
    User findByUsername(String username);
}
