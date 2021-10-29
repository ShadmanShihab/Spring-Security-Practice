package com.project.blogsite.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long blogId;
    private String blogName;
    private String blogContents;

    public Blog() {

    }

    public String getBlogName() {
        return blogName;
    }

    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }

    public String getBlogContents() {
        return blogContents;
    }

    public void setBlogContents(String blogContents) {
        this.blogContents = blogContents;
    }

    public Blog(long id, String blogName, String blogContents) {
        this.blogName = blogName;
        this.blogContents = blogContents;
    }
}
