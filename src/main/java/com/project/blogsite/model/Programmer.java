package com.project.blogsite.model;

import javax.persistence.*;

@Entity
public class Programmer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int pId;
    @Column(name = "name")
    String pName;

    String pLang;

    public Programmer(String pName, String pLang) {
        this.pName = pName;
        this.pLang = pLang;
    }

    public Programmer() {

    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpLang() {
        return pLang;
    }

    public void setpLang(String pLang) {
        this.pLang = pLang;
    }
}
