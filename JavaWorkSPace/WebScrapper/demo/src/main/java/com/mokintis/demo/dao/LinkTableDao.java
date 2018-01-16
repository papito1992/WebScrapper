package com.mokintis.demo.dao;




import com.mokintis.demo.model.LinkTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository

public class LinkTableDao implements ILinkTableDao{
@Autowired
JdbcTemplate jdbcTemplate;
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void update(LinkTable linkTable) {
        String sqlUpdate = "UPDATE linktable SET links=? WHERE id=?";
        jdbcTemplate.update(sqlUpdate,linkTable.getLinks(),linkTable.getId());
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
    public List<LinkTable> getLinks() {
        List<LinkTable> linkTableList;
        String sqlList = "SELECT * FROM linktable";
        linkTableList = entityManager.createNativeQuery(sqlList,LinkTable.class).getResultList();
        return linkTableList;
    }

    @Override
    public void save(LinkTable linkTable) {
        String sql = "INSERT INTO linktable (links) VALUES (?)";
        jdbcTemplate.update(sql, linkTable.getLinks());
    }

//    @Override
//    public void update(Keyword keyword) {
//        String sql = "UPDATE keywords SET keyword=? WHERE id=?";
//        jdbcTemplate.update(sql,keyword.getId());
//    }

    //FIX
    @Override
    public void deleteId(int linkId) {
        String sql = "DELETE FROM linktable WHERE id=?";
        jdbcTemplate.update(sql,linkId);
    }

//FIX
    @Override
    public void delete(LinkTable link) {
        String sql = "DELETE FROM linktable WHERE links=?";
        jdbcTemplate.update(sql, link);

    }

    @Override
    public List<LinkTable > findall() {
        return null;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
