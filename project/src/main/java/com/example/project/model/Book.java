package com.example.project.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Book {

    @Id
    @GeneratedValue
   private int id;
    private String name;
    private Date publicationDate;
    private String author;
    @Enumerated(EnumType.STRING)
    private Ganer ganer;
    private int numOfKids;



    public Book() {}

    public Book(Ganer ganer, String author, Date publicationDate, String name,int numOfKids) {
        this.ganer = ganer;
        this.author = author;
        this.publicationDate = publicationDate;
        this.name = name;
        this.numOfKids = numOfKids;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", publicationDate=" + publicationDate +
                ", author='" + author + '\'' +
                ", ganer=" + ganer +
                '}';
    }

    public Ganer getGaner() {
        return ganer;
    }

    public void setGaner(Ganer ganer) {
        this.ganer = ganer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
