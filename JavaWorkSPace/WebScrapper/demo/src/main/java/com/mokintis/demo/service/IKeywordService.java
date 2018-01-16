package com.mokintis.demo.service;



import com.mokintis.demo.model.Keyword;

import java.util.List;

public interface IKeywordService {
    public List<Keyword> getKeywords();

    public void insertKeyword(Keyword keyword);

    public void updateKeyword(Keyword keyword);
    public void deleteKeyword(Keyword keywordName);
    public void deleteKeywordId(int keywordId);

    public void findAllKeywords(Keyword keyword);
}
