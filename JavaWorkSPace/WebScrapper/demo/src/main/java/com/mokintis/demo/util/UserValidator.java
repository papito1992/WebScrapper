package com.mokintis.demo.util;

import com.mokintis.demo.model.User;
import com.mokintis.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class UserValidator implements Validator {
    @Autowired
    UserService userService;

    @Override
    public boolean supports(Class<?> aClass) {
        return User.class.equals(aClass);
    }

    @Override
    public void validate(Object ouser, Errors errors) {
        User user = (User) ouser;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "EmptySpace");

        // if exist user
        if (userService.findByUsername(user.getUsername())!=null)  {
            errors.rejectValue("username", "Warning.dublicate.username");
        }
        if (user.getUsername().length()<=6 || user.getUsername().length()>=32){
            errors.rejectValue("username", "Size.userForm.username");
        }
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "EmptySpace");
        if (user.getPassword().length()<=6 || user.getPassword().length()>=32){
            errors.rejectValue("password", "Size.password");
        }

        if (!user.getPasswordConfirm().equals(user.getPassword())) {
            errors.rejectValue("passwordConfirm", "Diff.passwordConfirm");
        }





    }
}
