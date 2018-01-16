package com.mokintis.demo.model;


import javax.persistence.*;

@Entity
@Table(name = "keywords")
public class Keyword {
private int id;
private String keywords;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "keyword")
    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public Keyword() {
    }

    public Keyword(int id) {
        this.id = id;
    }

    public Keyword(String keywords) {
        this.keywords = keywords;
    }
}
