package com.example.obrestdatajpa.controller;

import com.example.obrestdatajpa.entities.Book;
import com.example.obrestdatajpa.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api")
@RestController
public class BookController {

    @Autowired
    BookRepository bookRepository;
    // CRUD sobre la entidad Book

    //Buscar todos los libros.
    @GetMapping("/books")
    public List<Book> findAll(){
        // Recuperar y devolver los libros de BD
        return bookRepository.findAll();
    }

    // buscar un solo libro en BD por su id

    // Actualizar un libro existente en BD

    // Borrar un libro en BD


}
