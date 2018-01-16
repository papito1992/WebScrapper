package com.mokintis.demo.service;



import com.mokintis.demo.model.User;
import com.mokintis.demo.repository.RoleRep;
import com.mokintis.demo.repository.UserRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
public class UserServiceImp implements UserService{

    @Autowired
    UserRep userRep;
    @Autowired
    RoleRep roleRep;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(User user) {

        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(new HashSet<>(roleRep.findAll()));
        userRep.save(user);

    }

    @Override
    public User findByUsername(String username) {
        return userRep.findByUsername(username);
    }
}
