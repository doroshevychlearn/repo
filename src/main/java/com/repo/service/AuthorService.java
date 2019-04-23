package com.repo.service;

import com.repo.model.response.AuthorModelResponse;

public interface AuthorService {
    AuthorModelResponse getAuthorById(Long id);
}
