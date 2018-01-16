package com.mokintis.demo.command;


import com.mokintis.demo.model.User1;

public class UserCommand {
    //reusing domain class to not create values again
    //addmore fields if necesery
    User1 user1;

    public User1 getUser1() {
        return user1;
    }

    public void setUser1(User1 user1) {
        this.user1 = user1;
    }
}
