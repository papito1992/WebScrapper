package com.mokintis.demo.dao;

import com.mokintis.demo.model.DataBank;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public interface IDataBankDao {
    public List<DataBank> getResults();
    public void save(DataBank dataBank);
    public void update(DataBank dataBank);
    public void deleteId(int id);
    public void delete(DataBank dataBank);
    public List<DataBank> findall();
    public void save3(List<DataBank> map);

}
