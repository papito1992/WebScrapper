package com.mokintis.demo.service;



import com.mokintis.demo.dao.KeywordDao;
import com.mokintis.demo.dao.LinkTableDao;
import com.mokintis.demo.model.Keyword;
import com.mokintis.demo.model.LinkTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LinkTableService implements ILinkTableService {

    @Autowired(required = true)
    LinkTableDao linkTableDao;


    @Override
    public List<LinkTable> getLinks() {
        return linkTableDao.getLinks();
    }

    @Override
    public void insertLink(LinkTable linkTable) {
linkTableDao.save(linkTable);
    }

    @Override
    public void updateLink(LinkTable linkTable) {
linkTableDao.update(linkTable);
    }

    @Override
    public void deleteLink(LinkTable linkName) {
linkTableDao.delete(linkName);
    }

    @Override
    public void deleteLinkId(int linkId) {
        linkTableDao.deleteId(linkId);

    }

    public void findAllKeywords(Keyword keyword){

            String sql="SELECT * FROM keywords";
            //gauannme jdbc template is tevines klases ir padarome update

        }
}
