package com.example.project.Services;
//
//import org.example.liberaryproject.Repositories.LiberarienRepository;
//import org.example.liberaryproject.model.Book;
//import org.springframework.stereotype.Service;
//
//@Service
//public class Liberarian {
//
//    public void AddBook (Book book) {
//            if(book != null) {
//                if(LiberarienRepository.)
//            }
//    }
//
//
//
//    public void addCompany(Company company) throws CustomException {
//        if(company != null) {
//            if(!companiesRepo.existsByNameOrEmail(company.getName(), company.getEmail())) {
//                companiesRepo.save(company);
//            }
//            else {
//                throw new CustomException("Company is already exists");
//            }
//        }
//        else {
//            throw new CustomException("Cannot add empty company");
//        }
//    }
//
//
//
//}



import com.example.project.Repositories.LibrarianRepository;
import com.example.project.model.Librarian;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibrarianService {
    @Autowired
    private LibrarianRepository librarianRepository;

    public List<Librarian> getAllLibrarians() {
        return librarianRepository.findAll();
    }

    public Librarian saveLibrarian(Librarian librarian) {
        return librarianRepository.save(librarian);
    }

    public void deleteLibrarian(int id) {
        librarianRepository.deleteById(id);
    }
}

