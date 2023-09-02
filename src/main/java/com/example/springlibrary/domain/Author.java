package com.example.springlibrary.domain;

import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Author {



    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    public Author(String id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    private String name;

    private String surname;

    // @Joincolumn yazdığın yerde olan variable gözükür mesela buraya koyarsak book gözükür authorda  bu sebepten buraya yazmıyorum
    @ManyToMany(cascade = CascadeType.MERGE,mappedBy = "authors",fetch = FetchType.LAZY)
    private Set<Book> books;

}
