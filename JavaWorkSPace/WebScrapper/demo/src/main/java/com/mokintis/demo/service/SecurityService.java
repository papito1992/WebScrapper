package com.mokintis.demo.service;

public interface SecurityService {
    String findLogginUsername();
    void login(String username, String passw);


}
