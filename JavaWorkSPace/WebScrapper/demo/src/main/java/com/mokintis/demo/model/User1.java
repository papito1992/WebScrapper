/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mokintis.demo.model;

import org.springframework.stereotype.Repository;

import javax.persistence.*;

/**
 * @author skotc
 */
@Entity
@Table(name = "user1")

public class User1 {
    Integer userid;
    String name, phone, email, address, loginname, password;
    Integer role, loginstatus;

    public User1() {
    }

    public User1(String name, String phone, String email, String address, String loginname, String password, Integer role, Integer loginstatus) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.loginname = loginname;
        this.password = password;
        this.role = role;
        this.loginstatus = loginstatus;
    }

    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userinoId) {
        this.userid = userinoId;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Column(name = "loginname")
    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "role")
    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    @Column(name = "loginstatus")
    public Integer getLoginstatus() {
        return loginstatus;
    }

    public void setLoginstatus(Integer loginstatus) {
        this.loginstatus = loginstatus;
    }
}
