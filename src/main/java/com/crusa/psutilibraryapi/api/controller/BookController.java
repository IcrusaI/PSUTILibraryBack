package com.crusa.psutilibraryapi.api.controller;

import com.crusa.psutilibraryapi.api.model.Book;
import com.crusa.psutilibraryapi.api.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/books", produces = MediaType.APPLICATION_JSON_VALUE)
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("")
    public ResponseEntity<List<Book>> getAll() {
        List<Book> books = bookService
                .findAll();

        return new ResponseEntity<>(books, HttpStatus.OK);
    }
}
