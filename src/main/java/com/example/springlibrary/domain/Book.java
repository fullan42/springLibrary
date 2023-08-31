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

    @ManyToMany(fetch = FetchType.LAZY,mappedBy = "books",cascade = CascadeType.MERGE)
    @JoinTable(name = "book_author",joinColumns = @JoinColumn(name = "book_id"), inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<Author> authors;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Publisher publisher;
}
