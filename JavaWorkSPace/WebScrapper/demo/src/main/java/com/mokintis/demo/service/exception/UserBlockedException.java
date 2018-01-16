package com.mokintis.demo.service.exception;

public class UserBlockedException extends Exception {
    //sukurio user objekt withOUT error description

    public UserBlockedException(){}

    //sukurio user objekt with error description
    public UserBlockedException(String errDesc){
        super(errDesc);
    }
}
