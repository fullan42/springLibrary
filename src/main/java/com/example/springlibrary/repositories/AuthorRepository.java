package com.example.springlibrary.repositories;

import com.example.springlibrary.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorRepository extends JpaRepository<Author,String> {
    Optional<Author> findAuthorByName(String authorName);
}
