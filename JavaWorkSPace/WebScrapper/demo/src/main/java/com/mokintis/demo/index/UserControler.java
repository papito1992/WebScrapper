package com.mokintis.demo.index;

import com.mokintis.demo.dao.UserDao;
import com.mokintis.demo.model.User;

import com.mokintis.demo.service.SecurityService;
import com.mokintis.demo.service.UserService;
import com.mokintis.demo.util.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserControler {
    @Autowired
    UserService userService;
    //this index page will be my log in FORM
    //
    @Autowired
    UserDao userDao;
    @Autowired
    UserValidator userValidator;
    @Autowired
    SecurityService securityService;



    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register(Model model){
        model.addAttribute("userForm", new User());
        return "registration";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@ModelAttribute("userForm") User userForm, BindingResult bindresult, Model model ){

        userValidator.validate(userForm, bindresult );
        if (bindresult.hasErrors()){
            return "registration";
        }
        userService.save(userForm);
        securityService.login(userForm.getUsername(), userForm.getPasswordConfirm());

        return "redirect:/welcomemainpage";
    }

    @RequestMapping(value = {"/","/welcomemainpage"},  method = RequestMethod.GET)
    public String welcome(Model model){
        return "welcomemainpage";
    }



    @RequestMapping(value = "/login" , method = RequestMethod.GET)
    public String login(Model model, String error){
        if (error!=null){
            model.addAttribute("error", "wrong username and password");
        }

        return "login1";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpServletRequest request, HttpServletResponse response){
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        if (authentication != null){
//            new SecurityContextLogoutHandler().logout(request, response, authentication);
//        }
        return "redirect:/login?logout";
    }


    private String getPrincipal(){
        String userName = null;
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (principal instanceof UserDetails) {
            userName = ((UserDetails)principal).getUsername();
        } else {
            userName = principal.toString();
        }
        return userName;
    }
}

