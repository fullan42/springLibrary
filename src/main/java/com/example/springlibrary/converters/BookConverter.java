package com.example.springlibrary.converters;

import com.example.springlibrary.domain.Book;
import com.example.springlibrary.responses.CreateBookResponse;
import org.springframework.stereotype.Component;

@Component
public class BookConverter {

    public CreateBookResponse createBookConverter(Book book){
        CreateBookResponse createBookResponse=new CreateBookResponse(book.getId(), book.getName(), book.getIsbn());
        return createBookResponse;
    }

}
