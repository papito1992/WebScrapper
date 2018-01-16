package com.mokintis.demo.dao;


import com.mokintis.demo.model.Keyword;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class KeywordRowMapper implements RowMapper<Keyword> {
    @Override
    public Keyword mapRow(ResultSet rs, int rowNum) throws SQLException {
        Keyword keyword= new Keyword();
        keyword.setId(rs.getInt("id"));
        keyword.setKeywords(rs.getString("keyword"));
        return keyword;
    }
}
