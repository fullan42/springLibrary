package com.example.springlibrary.repositories;

import com.example.springlibrary.domain.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher,String> {
}
