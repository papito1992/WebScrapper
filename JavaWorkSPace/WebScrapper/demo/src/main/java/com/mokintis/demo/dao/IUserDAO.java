package com.mokintis.demo.dao;



import com.mokintis.demo.model.User1;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IUserDAO {



    public void save(User1 user1);
    public void update(User1 user1);
    public void delete(int userId);
    public void delete(User1 user1);
    public User1 findById(int userId);
    public List<User1> findAll();
    public List<User1> findByProperty(String propName, Object propValue);


}
