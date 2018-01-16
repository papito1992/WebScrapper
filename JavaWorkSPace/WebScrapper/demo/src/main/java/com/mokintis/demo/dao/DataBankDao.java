package com.mokintis.demo.dao;

import com.mokintis.demo.model.DataBank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
@Transactional
public class DataBankDao  implements IDataBankDao{
@Autowired
    JdbcTemplate jdbcTemplate;
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<DataBank> getResults() {
        List<DataBank> dataBankslist;
        String sql="SELECT id,insertedkeyword,linktableid,resultingfulltittle,resultinglink,scrappedlink FROM databank";
        dataBankslist = entityManager.createNativeQuery(sql,DataBank.class).getResultList();
        return dataBankslist;
    }

    @Override
    public void save(DataBank dataBank) {
String sql="INSERT INTO databank (insertedkeyword, scrappedlink, resultingfulltittle, resultinglink) VALUES (?,?,?,?)";
jdbcTemplate.update(sql,dataBank.getInsertedKeyword(),dataBank.getScrappedLink(),dataBank.getResultingFullTitle(),dataBank.getResultingLink());
    }



    public void save2(DataBank dataBank) {
        String sql="INSERT INTO databank (insertedkeyword, scrappedlink, resultingfulltittle, resultinglink) VALUES (?,?,?,?)";
        jdbcTemplate.update(sql,dataBank.getInsertedKeyword(),dataBank.getScrappedLink(),dataBank.getResultingFullTitle(),dataBank.getResultingLink());
    }



    @Override
    public void update(DataBank dataBank) {
String sql="UPDATE databank SET insertedkeyword=?, scrappedlink=?, resultingfulltittle=?, resultinglink=? WHERE id=?";
jdbcTemplate.update(sql,dataBank.getInsertedKeyword(),dataBank.getScrappedLink(),dataBank.getResultingLink(),dataBank.getResultingFullTitle());
    }

    @Override
    public void deleteId(int id) {
        String sqlDelete = "DELETE FROM databank where id=?";
        jdbcTemplate.update(sqlDelete,id);
    }

    @Override
    public void delete(DataBank dataBank) {

    }

    @Override
    public List<DataBank> findall() {
        return null;
    }

    @Override
    public void save3(List<DataBank> list) {
        String sql="INSERT INTO databank (insertedkeyword, scrappedlink, resultingfulltittle, resultinglink,linktableid) VALUES (?,?,?,?,?)";
//        DataBank
        list.forEach(db->jdbcTemplate.update(sql, db.getInsertedKeyword(), db.getScrappedLink(), db.getResultingFullTitle(), db.getResultingLink(),db.getLinktableid()));



    }


}
