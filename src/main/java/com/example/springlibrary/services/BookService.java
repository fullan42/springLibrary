package com.example.springlibrary.services;

import com.example.springlibrary.domain.Book;
import com.example.springlibrary.repositories.BookRepository;
import com.example.springlibrary.requests.GetBookRequest;
import com.example.springlibrary.responses.GetBookResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> findall(){
        return bookRepository.findAll();
    }
 }
