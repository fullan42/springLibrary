package com.example.springlibrary.repositories;

import com.example.springlibrary.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,String> {
}
