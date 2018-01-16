package com.mokintis.demo.command;
//komunikuoja su forma, ema data is kontrolerio ir paduoda i view, login command susieja abudu, judejimas abipusis, is controller i view ir is view i controller

public class LoginCommand {
    //reikia dvieju properties kad prisijungt
   private String loginname;
   private String password;

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
