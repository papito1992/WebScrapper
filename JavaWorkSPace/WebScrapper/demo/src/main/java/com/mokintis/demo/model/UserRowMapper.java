package com.mokintis.demo.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class UserRowMapper implements RowMapper<User1> {

    @Override
    public User1 mapRow(ResultSet rs, int rowNum) throws SQLException {

        User1 user1 = new User1();
        user1.setUserid(rs.getInt("userid"));
        user1.setName(rs.getString("name"));
        user1.setPhone(rs.getString("phone"));
        user1.setEmail(rs.getString("email"));
        user1.setAddress(rs.getString("address"));
        user1.setLoginname(rs.getString("loginname"));
        user1.setRole(rs.getInt("role"));
        user1.setLoginstatus(rs.getInt("loginstatus"));
        return user1;
    }
}
