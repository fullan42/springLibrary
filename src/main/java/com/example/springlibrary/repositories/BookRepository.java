package com.example.springlibrary.repositories;

import com.example.springlibrary.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,String> {
}
