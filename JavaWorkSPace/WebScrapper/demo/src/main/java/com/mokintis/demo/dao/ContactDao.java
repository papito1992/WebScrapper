package com.mokintis.demo.dao;


import com.mokintis.demo.model.Contact;
import com.mokintis.demo.model.ContactRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
@Transactional
public class ContactDao implements IContactDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @PersistenceContext
    EntityManager entityManager;
    @Override
    public void save(Contact contact) {
        String sql= ("INSERT INTO contact(name, phone, email, address, remark) VALUES (?,?,?,?,?)");
        jdbcTemplate.update(sql,contact.getName(),contact.getEmail(),contact.getAddress(),contact.getRemark(),contact.getPhone());
    }

    @Override
    public void update(Contact contact) {
        String sqlUpdate = "UPDATE contact SET name=?, phone=?, email=?, address=?, remark=? WHERE contactid=?";
        jdbcTemplate.update(sqlUpdate,contact.getName(),contact.getPhone(),contact.getEmail(),contact.getAddress(),contact.getRemark());
    }

    @Override
    public void delete(Integer contactid) {
        String sqlDelete = "DELETE FROM contact where contactid=?";
        jdbcTemplate.update(sqlDelete,contactid);
    }

    @Override
    public void delete(Contact contact) {
this.delete(contact.getContactid());
    }

    @Override
    public Contact findById(int contactId) {
        String sql="SELECT * FROM contact WHERE contactid=?";
        Contact contactid=jdbcTemplate.queryForObject(sql, Contact.class);
        jdbcTemplate.execute(sql);
    return contactid;}

    @Override
    public List<Contact> findall() {
        List<Contact> dataBankslist;
        String sql="SELECT id,insertedkeyword,linktableid,resultingfulltittle,resultinglink,scrappedlink FROM contact";
        dataBankslist = entityManager.createNativeQuery(sql,Contact.class).getResultList();
        return dataBankslist;
    }


    @Override
    public List<Contact> findByProperty(String propName, Object propValue) {
//        String sqlfindByProperty="SELECT * FROM contact WHERE "+propName+"=?";
        return null;}}
//    }
//}
