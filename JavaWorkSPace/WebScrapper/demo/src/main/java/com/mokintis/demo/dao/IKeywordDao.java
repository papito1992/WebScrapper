package com.mokintis.demo.dao;

import com.mokintis.demo.model.Keyword;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IKeywordDao {
    public List<Keyword> getKeywords();
    public void save(Keyword keyword);
    public void update(Keyword keyword);
    public void deleteId(int kid);
    public void delete(Keyword keyword);
    public List<Keyword> findall();
    
}
