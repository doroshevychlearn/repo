package com.repo.service.impl;

import com.repo.entity.Author;
import com.repo.model.response.AuthorModelResponse;
import com.repo.repository.AuthorRepository;
import com.repo.service.AuthorService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.repo.util.CheckUtil.notNull;

@Service
public class AuthorServiceImpl implements AuthorService {

    private AuthorRepository authorRepository;


    @Autowired
    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public AuthorModelResponse getAuthorById(Long id) {
        notNull(id, "id");
        Author author = this.authorRepository.getAuthorById(id);
        notNull(author, "author");
        AuthorModelResponse authorModel = new AuthorModelResponse();
        BeanUtils.copyProperties(author, authorModel);
        return authorModel;
    }
}
