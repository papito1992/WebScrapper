package com.mokintis.demo.service;

import com.mokintis.demo.model.DataBank;
import com.mokintis.demo.model.Keyword;

import java.util.List;

public interface IDataBankService {
    public List<DataBank> getData();

    public void insertData(List<DataBank> dataBank);

    public void updateData(DataBank dataBank);
    public void deleteData(DataBank dataBank);
    public void deleteData(int keywordId);

    public void findAllDataRows(DataBank dataBank);
}
