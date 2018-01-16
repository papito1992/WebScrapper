package com.mokintis.demo.dao;


import com.mokintis.demo.model.Keyword;
import com.mokintis.demo.model.LinkTable;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LinkRowMapper implements RowMapper<LinkTable> {
    @Override
    public LinkTable mapRow(ResultSet rs, int rowNum) throws SQLException {
        LinkTable linkTable= new LinkTable();
        linkTable.setId(rs.getInt("id"));
        linkTable.setLinks(rs.getString("address"));
        return linkTable;
    }
}
