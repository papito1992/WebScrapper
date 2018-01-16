package com.mokintis.demo.service;


import com.mokintis.demo.model.Contact;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ContactServiceInterface {
    public void savecontact(Contact contact);
    public void updatecontact(Contact contact);
    //naudojant prime key bus daromas trynimas
    public void deletesinglecontact(Integer contactid);
    public void deletemultiplecontact(Integer[] contactids);
    //these methods returns all user contacts, user who is  logged in.
    public List<Contact> findUserContact(Integer userId);
    // the method searach returns for user(userId)
    //
    // based on given free texr criteria(text)
    public List<Contact> findUserContact(Integer userId, String text);
}
