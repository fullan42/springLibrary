package com.example.springlibrary.services;

import com.example.springlibrary.converters.AuthorConverter;
import com.example.springlibrary.repositories.AuthorRepository;
import com.example.springlibrary.requests.CreateAuthorRequest;
import com.example.springlibrary.responses.CreateAuthorResponse;
import com.example.springlibrary.domain.Author;
import org.springframework.stereotype.Service;


@Service
public class AuthorService {


    private final AuthorRepository authorRepository;
    private final AuthorConverter authorConverter;

    public AuthorService(AuthorRepository authorRepository, AuthorConverter authorConverter) {
        this.authorRepository = authorRepository;
        this.authorConverter = authorConverter;
    }

    CreateAuthorResponse createAuthorResponse(CreateAuthorRequest request){
        Author author= new Author();
        author.setId(request.getId());
        author.setName(request.getName());
        author.setSurname(request.getSurname());
        //expection gelecek buraya
        authorRepository.save(author);
        return authorConverter.createAuthorConverter(author);


    }

}
