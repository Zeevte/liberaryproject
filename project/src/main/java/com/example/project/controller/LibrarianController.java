package com.example.project.controller;

import com.example.project.Services.LibrarianService;
import com.example.project.model.Librarian;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/librarians")
public class LibrarianController {
    @Autowired
    private LibrarianService librarianService;

    @GetMapping
    public List<Librarian> getAllLibrarians() {
        return librarianService.getAllLibrarians();
    }

    @PostMapping
    public Librarian createLibrarian(@RequestBody Librarian librarian) {
        return librarianService.saveLibrarian(librarian);
    }

    @DeleteMapping("/{id}")
    public void deleteLibrarian(@PathVariable int id) {
        librarianService.deleteLibrarian(id);
    }
}

