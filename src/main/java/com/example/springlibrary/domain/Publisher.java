package com.example.springlibrary.domain;

import com.example.springlibrary.domain.Book;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    private String address;

    private String city;

    private String state;

    private String zip;

    // CASCADE TYPELAR KAPSAYICI SINIF SİLİNDİĞİNDE O VARİABLE A NE OLACAĞINI BELİRTİR YANİ BURDA BOOK SİLİNCEKSE ALL SİLİNMİCEKSE MERGE EDİCEZ
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "publisher")
    private Set<Book> books;
}