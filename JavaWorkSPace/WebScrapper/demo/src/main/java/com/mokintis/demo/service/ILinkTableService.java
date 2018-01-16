package com.mokintis.demo.service;



import com.mokintis.demo.model.Keyword;
import com.mokintis.demo.model.LinkTable;

import java.util.List;

public interface ILinkTableService {
    public List<LinkTable> getLinks();

    public void insertLink(LinkTable linkTable);

    public void updateLink(LinkTable linkTable);
    public void deleteLink(LinkTable linkName);
    public void deleteLinkId(int linkId);

    public void findAllKeywords(Keyword keyword);
}
