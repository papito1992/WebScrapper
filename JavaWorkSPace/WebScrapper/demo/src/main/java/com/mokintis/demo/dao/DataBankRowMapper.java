package com.mokintis.demo.dao;

import com.mokintis.demo.model.DataBank;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBankRowMapper implements RowMapper{
    @Override
    public Object mapRow(ResultSet rs, int i) throws SQLException {
        DataBank dataBank= new DataBank();
        dataBank.setId(rs.getInt("id"));
        dataBank.setInsertedKeyword(rs.getString("insertedkeyword"));
        dataBank.setScrappedLink(rs.getString("scrappedlink"));
        dataBank.setResultingFullTitle(rs.getString("resultingfulltittle"));
        dataBank.setResultingLink(rs.getString("resultinglink"));
        dataBank.setLinktableid(rs.getInt("resultinglink"));
        return dataBank;
    }
}
