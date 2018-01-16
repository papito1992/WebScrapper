package com.mokintis.demo.service;

import com.mokintis.demo.dao.DataBankDao;
import com.mokintis.demo.dao.IDataBankDao;
import com.mokintis.demo.model.DataBank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DataBankService implements IDataBankService {
    @Autowired
    DataBankDao dataBankDao;


    @Override
    public List<DataBank> getData() {
        return dataBankDao.getResults();
    }

    @Override
    public void insertData(List<DataBank> dataBank) {
dataBankDao.save3(dataBank);
    }

    @Override
    public void updateData(DataBank dataBank) {

    }

    @Override
    public void deleteData(DataBank dataBank) {

    }

    @Override
    public void deleteData(int keywordId) {
dataBankDao.deleteId(keywordId);
    }

    @Override
    public void findAllDataRows(DataBank dataBank) {

    }
}
