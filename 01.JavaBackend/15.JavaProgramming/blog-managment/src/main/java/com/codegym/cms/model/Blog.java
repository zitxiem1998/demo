package com.codegym.cms.model;

import javax.persistence.*;

@Entity
@Table(name = "Blogs")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String describe;
    private String createDate;

    public Blog() {

    }

    public Blog(String title, String describe, String date) {
        this.title = title;
        this.describe = describe;
        this.createDate = date;
    }

    @Override
    public String toString() {
        return String.format("Blog[ title is %s, describe is %s, createDate is %s", title, describe, createDate);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
