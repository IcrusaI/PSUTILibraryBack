package com.crusa.psutilibraryapi.api.service;

import com.crusa.psutilibraryapi.api.model.Book;
import com.crusa.psutilibraryapi.api.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private BookRepository bookRepository;

    public BookService() {}

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> findAll() {
        return (List<Book>) bookRepository.findAll();
    }
}
