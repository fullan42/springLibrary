package com.example.springlibrary.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;


    private String isbn;

    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.MERGE)
    @JoinColumn// bunun yerine @JoinColumn yazarsan yeter
    private Set<Author> authors;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.MERGE)
    @JoinColumn
    private Publisher publisher;

    public Book(String id, String name, String isbn) {
        this.id = id;
        this.name = name;
        this.isbn = isbn;
    }

}
