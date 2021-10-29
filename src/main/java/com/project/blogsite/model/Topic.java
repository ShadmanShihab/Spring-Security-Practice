package com.project.blogsite.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String topicName;
    @OneToMany
    private List<Blog> blogList;

    public Topic() {

    }
}
