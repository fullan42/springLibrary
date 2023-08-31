package com.example.springlibrary.converters;

import com.example.springlibrary.responses.CreateAuthorResponse;
import com.example.springlibrary.domain.Author;
import org.springframework.stereotype.Component;

@Component
public class AuthorConverter {

    public  CreateAuthorResponse createAuthorConverter(Author author){
        CreateAuthorResponse createAuthorResponse= new CreateAuthorResponse(author.getId(),author.getName(),author.getSurname());
        return createAuthorResponse;

    }
}
