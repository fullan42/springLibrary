package com.example.springlibrary.controllers;

import com.example.springlibrary.requests.CreateAuthorRequest;
import com.example.springlibrary.requests.DeleteAuthorRequest;
import com.example.springlibrary.responses.CreateAuthorResponse;
import com.example.springlibrary.services.AuthorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {
    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }
    @DeleteMapping("deleteById")
    public ResponseEntity<Void> deleteById(DeleteAuthorRequest request){
        authorService.deleteById(request);
        return new ResponseEntity<>( HttpStatus.OK);

    }
    @PostMapping("create")
    public ResponseEntity<CreateAuthorResponse> createAuthorResponse(CreateAuthorRequest request){
        return new ResponseEntity<>(authorService.createAuthorResponse(request), HttpStatus.CONFLICT);
    }
}
