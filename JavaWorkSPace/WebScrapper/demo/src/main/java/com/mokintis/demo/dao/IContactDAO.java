package com.mokintis.demo.dao;



import com.mokintis.demo.model.Contact;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IContactDAO {
    public void save(Contact contact);
    public void update(Contact contact);
    public void delete(Integer userId);
    public void delete(Contact contact);
    public Contact findById(int contactId);
 public List<Contact>findall();
    public List<Contact> findByProperty(String propName, Object propValue);
}
