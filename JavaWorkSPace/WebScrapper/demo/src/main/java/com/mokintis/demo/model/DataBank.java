package com.mokintis.demo.model;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;

import javax.persistence.*;


//@NamedQuery(name = "databank", query = )
@Entity
@Table(name = "databank")
public class DataBank{
    private int id,linktableid;
   private String insertedKeyword, scrappedLink, resultingFullTitle, resultingLink;



    public void setId(int id) {
        this.id = id;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    @Column(name = "linktableid")
    public int getLinktableid() {
        return linktableid;
    }

    public void setLinktableid(int linktableid) {
        this.linktableid = linktableid;
    }

    @Column(name = "insertedkeyword")
    public String getInsertedKeyword() {
        return insertedKeyword;
    }

    public void setInsertedKeyword(String insertedKeyword) {
        this.insertedKeyword = insertedKeyword;
    }

    @Column(name = "scrappedlink")
    public String getScrappedLink() {
        return scrappedLink;
    }

    public void setScrappedLink(String scrappedLink) {
        this.scrappedLink = scrappedLink;
    }

    @Column(name = "resultingfulltittle")
    public String getResultingFullTitle() {
        return resultingFullTitle;
    }

    public void setResultingFullTitle(String resultingFullTitle) {
        this.resultingFullTitle = resultingFullTitle;
    }

    @Column(name = "resultinglink")
    public String getResultingLink() {
        return resultingLink;
    }

    public void setResultingLink(String resultingLink) {
        this.resultingLink = resultingLink;
    }

    public DataBank() {
    }


}
