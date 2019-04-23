package com.repo.repository;

import com.repo.entity.Book;

import java.math.BigDecimal;
import java.util.List;

public interface BookRepository {

    Book saveBook(Book b);

    void deleteBook(Book b);

    List<Book> getAllBooks();

    Book getBookById(Long id);

    Book getBookByName(String name);

    Book getBookByPrice(BigDecimal price);

}
