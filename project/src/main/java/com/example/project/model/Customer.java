package com.example.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer {

    @Id
    @GeneratedValue
    private int customer_id;
    private String customername;
    private String customeraddress;
    private String customerphone;
    private String customeremail;
    @OneToMany
    private List<Book> books  = new ArrayList<Book>();


    public Customer() {}

    public Customer(List<Book> books, String customeremail, String customerphone, String customeraddress, String customername) {
        this.books = books;
        this.customeremail = customeremail;
        this.customerphone = customerphone;
        this.customeraddress = customeraddress;
        this.customername = customername;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customer_id=" + customer_id +
                ", customername='" + customername + '\'' +
                ", customeraddress='" + customeraddress + '\'' +
                ", customerphone='" + customerphone + '\'' +
                ", customeremail='" + customeremail + '\'' +
                ", books=" + books +
                '}';
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getCustomeraddress() {
        return customeraddress;
    }

    public void setCustomeraddress(String customeraddress) {
        this.customeraddress = customeraddress;
    }

    public String getCustomerphone() {
        return customerphone;
    }

    public void setCustomerphone(String customerphone) {
        this.customerphone = customerphone;
    }

    public String getCustomeremail() {
        return customeremail;
    }

    public void setCustomeremail(String customeremail) {
        this.customeremail = customeremail;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
