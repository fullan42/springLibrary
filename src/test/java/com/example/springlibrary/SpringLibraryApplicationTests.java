package com.example.springlibrary;

import com.example.springlibrary.requests.CreateAuthorRequest;
import com.example.springlibrary.services.AuthorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringLibraryApplicationTests {
    @Autowired
    AuthorService authorService;

    public AuthorService getAuthorService() {
        return authorService;
    }

    @Test
    void contextLoads() {
        CreateAuthorRequest request = new CreateAuthorRequest();
        request.setId("hasan");
        request.setName("hasan");
        request.setSurname("hasan");

        System.out.println(authorService.createAuthorResponse(request));
    }

}
