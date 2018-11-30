package com.master.pace.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "t_article")
public class Article {

    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "subject", nullable = false, length = 100)
    private String subject;
    @Type(type = "text")
    @Column(name = "content", nullable = false)
    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}