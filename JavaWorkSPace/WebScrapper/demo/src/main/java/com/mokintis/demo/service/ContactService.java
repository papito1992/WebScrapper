package com.mokintis.demo.service;

import com.mokintis.demo.dao.ContactDao;
import com.mokintis.demo.model.Contact;
import com.mokintis.demo.model.ContactRowMapper;
import com.mokintis.demo.util.StringUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

//visalaik irasyti service i implementacijos klase
@Service
public class ContactService implements ContactServiceInterface {
    @Autowired
    JdbcTemplate jdbcTemplate;
@Autowired
ContactDao contactDAO;
//pernaudosim daug contact dao methodu del to injectinam
// dependancy per autowired prie objekto per kuri galesim pasiekti methodus
    @Override
    public void savecontact(Contact contact) {
contactDAO.save(contact);
    }

    @Override
    public void updatecontact(Contact contact) {
contactDAO.update(contact);
    }

    @Override
    public void deletesinglecontact(Integer contactid) {
contactDAO.delete(contactid);
    }

    @Override

    public void deletemultiplecontact(Integer[] contactids) {
//dar reikia sukurti helper methoda,
// kad convertint array into comma seperated string,
// o musu array yra integer[] contacids
//        String ids = StringUtility.toCommaSeparationString(contactids);
//        String sqldeleteBulk="DELETE FROM contact WHERE contactid IN("+ids+")";
//        //gauannme jdbc template is tevines klases ir padarome update
//        jdbcTemplate().update(sqldeleteBulk);
    }

    @Override
    public List<Contact> findUserContact(Integer userId) {
        return   contactDAO.findByProperty("userid",userId);
     }

    @Override
    public List<Contact> findUserContact(Integer userId, String text) {
        //patern searching query
        String sql="SELECT * FROM contact WHERE userid=? AND" +
                " (name LIKE '%"+text+"%' OR address LIKE '%"+text+"%' OR phone LIKE '%"+text+"%') or email LIKE '%"+text+"%' OR remark LIKE '%"+text+"%'";
        //soiuncem reiksmia tam klaustukui


return jdbcTemplate.query(sql, new ContactRowMapper(),userId);
    }
}
