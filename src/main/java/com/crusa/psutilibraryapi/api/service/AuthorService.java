package com.crusa.psutilibraryapi.api.service;

import com.crusa.psutilibraryapi.api.model.Author;
import com.crusa.psutilibraryapi.api.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    private AuthorRepository authorRepository;

    public AuthorService() {}

    @Autowired
    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<Author> findAll() {
        return (List<Author>) authorRepository.findAll();
    }
}
