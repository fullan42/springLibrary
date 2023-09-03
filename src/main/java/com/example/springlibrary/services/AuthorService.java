package com.example.springlibrary.services;

import com.example.springlibrary.converters.AuthorConverter;
import com.example.springlibrary.core.constant.Constant;
import com.example.springlibrary.core.exception.AuthorNotFoundException;
import com.example.springlibrary.repositories.AuthorRepository;
import com.example.springlibrary.requests.CreateAuthorRequest;
import com.example.springlibrary.requests.DeleteAuthorRequest;
import com.example.springlibrary.requests.UpdateAuthorRequest;
import com.example.springlibrary.responses.CreateAuthorResponse;
import com.example.springlibrary.domain.Author;
import com.example.springlibrary.responses.UpdateAuthorResponse;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Data
public class AuthorService {

    private final AuthorRepository authorRepository;

    private final AuthorConverter authorConverter;

    public AuthorService(AuthorRepository authorRepository, AuthorConverter authorConverter) {
        this.authorRepository = authorRepository;
        this.authorConverter = authorConverter;
    }

    public void deleteById(DeleteAuthorRequest request){
        findById(request.getId());
        authorRepository.deleteById(request.getId());

    }
    public Author getAuthor(String id){
        return findById(id);
    }
    public CreateAuthorResponse createAuthorResponse(CreateAuthorRequest request){
        Author author= new Author();
        author.setId(request.getId());
        author.setName(request.getName());
        author.setSurname(request.getSurname());
        authorRepository.save(author);
        return authorConverter.createAuthorConverter(author);


    }
    private Author findById(String id){
        return authorRepository.findById(id).orElseThrow(() -> new AuthorNotFoundException(Constant.AUTHOR_NOT_FOUND));
    }
    public UpdateAuthorResponse updateAuthorResponse(UpdateAuthorRequest request){
       Author author= authorRepository.findAuthorByName(request.getName()).orElseThrow((() -> new AuthorNotFoundException(Constant.AUTHOR_NOT_FOUND)));
       author.setName(request.getName());
       author.setSurname(request.getSurname());
       return authorConverter.updateConverter(author);
    }
}
