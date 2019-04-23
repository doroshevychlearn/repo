package com.repo.repository;

import com.repo.entity.Author;

import java.util.List;

public interface AuthorRepository {

    void deleteAuthor(Long id);

    List<Author> getAllAuthors();

    Author getAuthorById(Long id);

    Author saveAuthor(Author author);

    void deleteAuthor(Author author);

    Author getAuthorByLastName(String name);

    Author getAuthorByFirstName(String name);

}
