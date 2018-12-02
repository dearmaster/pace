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
    private Long id;
    @Column(name = "subject", nullable = false, length = 100)
    private String subject;
    @Type(type = "text")
    @Column(name = "content", nullable = false)
    private String content;

    public Article() {
    }

    public Article(String subject, String content) {
        this.subject = subject;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", subject='" + subject + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

}