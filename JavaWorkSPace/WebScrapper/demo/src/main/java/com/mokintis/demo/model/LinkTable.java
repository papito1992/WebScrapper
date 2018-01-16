package com.mokintis.demo.model;


import javax.persistence.*;

@Entity
@Table(name = "linktable")
public class LinkTable {
private int id;
private String links;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLinks() {
        return links;
    }

    public void setLinks(String links) {
        this.links = links;
    }

    public LinkTable() {
    }

    public LinkTable(int id) {
        this.id = id;
    }

    public LinkTable(String links) {
        this.links = links;
    }
}
