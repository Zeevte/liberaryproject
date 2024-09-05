//package com.example.project.model;
//
//import jakarta.persistence.*;
//
//import java.util.Date;
//
//@Entity
//public class Book {
//
//    @Id
//    @GeneratedValue
//   private int id;
//    private String name;
//    private Date publicationDate;
//    private String author;
//    @Enumerated(EnumType.STRING)
//    private Ganer ganer;
//    private int numOfKids;
//
//
//
//    public Book() {}
//
//    public Book(Ganer ganer, String author, Date publicationDate, String name,int numOfKids) {
//        this.ganer = ganer;
//        this.author = author;
//        this.publicationDate = publicationDate;
//        this.name = name;
//        this.numOfKids = numOfKids;
//    }
//
//    @Override
//    public String toString() {
//        return "Book{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", publicationDate=" + publicationDate +
//                ", author='" + author + '\'' +
//                ", ganer=" + ganer +
//                '}';
//    }
//
//    public Ganer getGaner() {
//        return ganer;
//    }
//
//    public void setGaner(Ganer ganer) {
//        this.ganer = ganer;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Date getPublicationDate() {
//        return publicationDate;
//    }
//
//    public void setPublicationDate(Date publicationDate) {
//        this.publicationDate = publicationDate;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//}


package com.example.project.model;

import jakarta.persistence.*;

import java.time.LocalDate;

/**
 * Represents a book in the library.
 */
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private LocalDate publicationDate;
    private String author;

    @Enumerated(EnumType.STRING)
    private Genre genre;

    private int numOfKids;

    @ManyToOne
    @JoinColumn(name = "customer_id") // השם של העמודה בטבלת הספרים
    private Customer customer; // קשר ללקוח

    public Book() {}

    public Book(Genre genre, String author, LocalDate publicationDate, String name, int numOfKids) {
        this.genre = genre;
        this.author = author;
        this.publicationDate = publicationDate;
        this.name = name;
        this.numOfKids = numOfKids;
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", publicationDate=" + publicationDate +
                ", author='" + author + '\'' +
                ", genre=" + genre +
//                ", customer=" + (customer != null ? customer.getId() : "null")
                '}';
    }

    // Getters and Setters
    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
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

    public Customer getCustomer() {
        return customer; // Getter ללקוח
    }

    public void setCustomer(Customer customer) {
        this.customer = customer; // Setter ללקוח
    }
}
