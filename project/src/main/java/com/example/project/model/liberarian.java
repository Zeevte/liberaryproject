package com.example.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class liberarian {

    @Id
    @GeneratedValue
    private int id;
    private String name;

    @OneToMany
    private List<Book> books  = new ArrayList<Book>();
    @OneToMany
    private List<Customer> customers  = new ArrayList<Customer>();

    public liberarian() {}

    public liberarian(List<Customer> customers, List<Book> books, String name) {
        this.customers = customers;
        this.books = books;
        this.name = name;
    }

    @Override
    public String toString() {
        return "liberarian{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", books=" + books +
                ", customers=" + customers +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
