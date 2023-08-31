package com.example.springlibrary.controllers;

import com.example.springlibrary.services.BookService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {


    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    @RequestMapping("books")
    public String getBooks(Model model){
        model.addAttribute("books",bookService.findall());
        return "books";

    }
}
