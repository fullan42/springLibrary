package com.example.springlibrary.services;

import com.example.springlibrary.converters.BookConverter;
import com.example.springlibrary.core.constant.Constant;
import com.example.springlibrary.core.exception.BookAlreadyExistException;
import com.example.springlibrary.core.exception.BookNotFoundException;
import com.example.springlibrary.domain.Book;
import com.example.springlibrary.repositories.BookRepository;
import com.example.springlibrary.requests.CreateBookRequest;
import com.example.springlibrary.responses.CreateBookResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private final BookRepository bookRepository;
    private final BookConverter bookConverter;

    public BookService(BookRepository bookRepository,BookConverter bookConverter) {
        this.bookRepository = bookRepository;
        this.bookConverter = bookConverter;
    }

    public List<Book> findall(){
        return bookRepository.findAll();
    }

    public CreateBookResponse createBook(CreateBookRequest request){
        Book book= new Book(request.getId(), request.getName(), request.getIsbn());
        return bookConverter.createBookConverter(book);
    }
    public Book findById(String id){
        return bookRepository.findById(id).orElseThrow(() -> new BookNotFoundException(Constant.BOOK_NOT_FOUND));
    }
 }
