package com.example.project.controller;

import com.example.project.Services.CustomerService;
import com.example.project.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/customers")
    public class CustomerController {
        @Autowired
        private CustomerService customerService;

        @GetMapping
        public List<Customer> getAllCustomers() {
            return customerService.getAllCustomers();
        }

        @PostMapping
        public Customer createCustomer(@RequestBody Customer customer) {
            return customerService.saveCustomer(customer);
        }

        @DeleteMapping("/{id}")
        public void deleteCustomer(@PathVariable int id) {
            customerService.deleteCustomer(id);
        }
    }

