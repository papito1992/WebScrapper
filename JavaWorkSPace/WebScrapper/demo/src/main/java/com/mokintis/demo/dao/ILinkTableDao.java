package com.mokintis.demo.dao;


import com.mokintis.demo.model.LinkTable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ILinkTableDao {
    public List<LinkTable> getLinks();
    public void save(LinkTable linkTable);
    public void update(LinkTable linkTable);
    public void deleteId(int lid);
    public void delete(LinkTable link);
    public List<LinkTable> findall();
    
}
