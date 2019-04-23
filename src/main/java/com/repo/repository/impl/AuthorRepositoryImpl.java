package com.repo.repository.impl;

import com.repo.entity.Author;
import com.repo.repository.AuthorRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import java.util.Objects;

import static com.repo.util.CheckUtil.notNull;
import static java.util.Objects.nonNull;

@Repository
public class AuthorRepositoryImpl implements AuthorRepository {

    @PersistenceContext
    private EntityManager entityManager;

    private static final String GET_BY_ID =
            "SELECT a.id as id, " +
                    "a.email as email, " +
                    "a.first_name as first_name, " +
                    "a.last_name as last_name " +
                    "FROM author a WHERE a.id = ?";

    @Override
    public void deleteAuthor(Long id) {

    }

    @Override
    public List<Author> getAllAuthors() {
        return null;
    }

    @Override
    public Author getAuthorById(Long id) {
        notNull(id, "id");
        Query query = entityManager.createNativeQuery(this.GET_BY_ID, Author.class).setParameter(1, id);
        List resultList = query.getResultList();
        Author author = null;
        if(nonNull(resultList) && resultList.size() == 1){
            author = (Author) resultList.get(0);
        }
        return author;
    }

    @Override
    public Author saveAuthor(Author author) {
        return null;
    }

    @Override
    public void deleteAuthor(Author author) {

    }

    @Override
    public Author getAuthorByLastName(String name) {
        return null;
    }

    @Override
    public Author getAuthorByFirstName(String name) {
        return null;
    }
}
