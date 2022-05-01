package com.crusa.psutilibraryapi.api.repository;

import com.crusa.psutilibraryapi.api.model.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
