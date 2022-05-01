package com.crusa.psutilibraryapi.api.repository;

import com.crusa.psutilibraryapi.api.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
}
