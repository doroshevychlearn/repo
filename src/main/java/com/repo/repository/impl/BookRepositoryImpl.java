package com.repo.repository.impl;

import com.repo.entity.Book;
import com.repo.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class BookRepositoryImpl implements BookRepository {
    @Override
    public Book saveBook(Book b) {
        return null;
    }

    @Override
    public void deleteBook(Book b) {

    }

    @Override
    public List<Book> getAllBooks() {
        return null;
    }

    @Override
    public Book getBookById(Long id) {
        return null;
    }

    @Override
    public Book getBookByName(String name) {
        return null;
    }

    @Override
    public Book getBookByPrice(BigDecimal price) {
        return null;
    }
}
