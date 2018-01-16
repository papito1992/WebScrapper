package com.mokintis.demo.dao;

import com.mokintis.demo.model.User1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

//cia yra repositorijos klase, nes jinai komunikuoja su duomenu base ir valdo duomenu bazes. Klase valdanti
// duomenu baze turi butinai buti pavadinta @repository anotacija
@Repository
public class UserDao implements IUserDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @PersistenceContext
    EntityManager entityManager;
    @Override
    public void save(User1 user1) {
        String sql="INSERT into user1 (name, phone, email, address, loginname, password) VALUES (?,?,?,?,?,?)";
        jdbcTemplate.update(sql, user1.getName(), user1.getEmail(), user1.getPhone(), user1.getAddress(), user1.getLoginname(), user1.getPassword());
    }
//    public void save(User1 u) {
//        String sql= ("INSERT INTO user1(name, phone, email, address, loginname, password, role, loginstatus)" +
//                " VALUES (:name, :phone, :email, :address, :loginname, :password, :role, :loginstatus)");//pasitikslinti del sito! NOTE
//        //need to bind the parametres
//        Map m= new HashMap();
//        m.put("name",u.getName());
//        //sitas "name" dabar yra suristas su vardu duotu UZERIO O NE IS DUOMENU BAZES
//        m.put("phone",u.getPhone());
//        m.put("email",u.getEmail());
//        m.put("address",u.getAddress());
//        m.put("loginname",u.getLoginname());
//        m.put("password",u.getPassword());
//        m.put("role",u.getRole());
//        m.put("loginstatus",u.getLoginstatus());
////objektas suris value sukurta su objektu
//        KeyHolder khs= new GeneratedKeyHolder();
//        //PARAM source objektas nurodo is kur paimti bus parametru values
//        SqlParameterSource ps= new MapSqlParameterSource(m);
//        super.getNamedParameterJdbcTemplate().update(sql,ps,khs, new String[]{"userid"});
//    }

    @Override
    public void update(User1 user1) {
        String sqlUpdate = "UPDATE user1 SET name=?, phone=?, email=?, address=?, loginname=?,password=? WHERE userid=?";
        jdbcTemplate.update(sqlUpdate, user1.getName(), user1.getName(), user1.getPhone(), user1.getAddress(), user1.getLoginname(), user1.getPassword(), user1.getUserid());
    }

    @Override
    public void delete(int userId) {
        String sql = "DELETE FROM user1 WHERE userid=?";
        jdbcTemplate.update(sql,userId);
    }

    @Override
    public void delete(User1 user1) {

    }

    @Override
    public User1 findById(int userId) {
        String sql="SELECT * FROM user1 WHERE userid=?";
        User1 user1 =jdbcTemplate.queryForObject(sql, User1.class);
        jdbcTemplate.execute(sql);
        return user1;
    }

    @Override
    public List<User1> findAll() {
        List<User1> user1List;
        String sqlList = "SELECT * FROM user1";
        user1List = entityManager.createNativeQuery(sqlList,User1.class).getResultList();
        return user1List;
    }

    @Override
    public List<User1> findByProperty(String propName, Object propValue) {
        return null;
    }
}
