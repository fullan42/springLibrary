package com.example.springlibrary.converters;

import com.example.springlibrary.responses.CreateAuthorResponse;
import com.example.springlibrary.domain.Author;
import com.example.springlibrary.responses.UpdateAuthorResponse;
import org.springframework.stereotype.Component;

@Component
public class AuthorConverter {

    public  CreateAuthorResponse createAuthorConverter(Author author){
        CreateAuthorResponse createAuthorResponse= new CreateAuthorResponse(author.getId(),author.getName(),author.getSurname());
        return createAuthorResponse;

    }
    public UpdateAuthorResponse updateConverter(Author author){
        UpdateAuthorResponse updateAuthorResponse= new UpdateAuthorResponse(author.getId(), author.getName(), author.getSurname());
        return updateAuthorResponse;
    }
}
