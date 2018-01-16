package com.mokintis.demo.dao;




import com.mokintis.demo.model.Keyword;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class KeywordDao  implements IKeywordDao{
@Autowired
JdbcTemplate jdbcTemplate;
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void update(Keyword keyword) {
        String sqlUpdate = "UPDATE keywords SET keyword=? WHERE id=?";
        jdbcTemplate.update(sqlUpdate,keyword.getKeywords(),keyword.getId());
    }

//    @Override
//    public List<Keyword> getKeywords() {
//        String sql = "select * from keywords";
////        KeywordRowMapper rowmapper = new KeywordRowMapper();
//        List<Keyword> keywordList = jdbcTemplate.query(sql, (RowCallbackHandler) new KeywordRowMapper());
//
//        return keywordList;
//
//    }

    @Override
    public List<Keyword> getKeywords() {
        List<Keyword> keywordList;
        String sqlList = "SELECT id,keyword FROM keywords";
        keywordList = entityManager.createNativeQuery(sqlList,Keyword.class).getResultList();
        return keywordList;
    }

    @Override
    public void save(Keyword keyword) {
        String sql = "INSERT INTO keywords (keyword) VALUES (?)";
        jdbcTemplate.update(sql, keyword.getKeywords());
    }

//    @Override
//    public void update(Keyword keyword) {
//        String sql = "UPDATE keywords SET keyword=? WHERE id=?";
//        jdbcTemplate.update(sql,keyword.getId());
//    }

    @Override
    public void deleteId(int keyId) {
        String sql = "DELETE FROM keywords WHERE id=?";
        jdbcTemplate.update(sql,keyId);
    }


    @Override
    public void delete(Keyword keyword) {
        String sql = "DELETE FROM keywords WHERE keyword=?";
        jdbcTemplate.update(sql, keyword);

    }

    @Override
    public List<Keyword> findall() {
        return null;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
