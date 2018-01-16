package com.mokintis.demo.service;



import com.mokintis.demo.dao.KeywordDao;
import com.mokintis.demo.model.Keyword;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KeywordService implements IKeywordService {

    @Autowired(required = true)
    KeywordDao keydao;
    @Override
    public List<Keyword> getKeywords() {
        return keydao.getKeywords();
    }

    public void insertKeyword(Keyword keyword){
         keydao.save(keyword);}
    public void updateKeyword(Keyword keyword){
        keydao.update(keyword);}
    public void deleteKeywordId(int keywordId){
        keydao.deleteId(keywordId);}

    @Override
    public void deleteKeyword(Keyword keywordName) {
        keydao.delete(keywordName);
    }

    public void findAllKeywords(Keyword keyword){

            String sql="SELECT * FROM keywords";
            //gauannme jdbc template is tevines klases ir padarome update

        }
}
