package com.example.springlibrary.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateBookRequest {
    private String id;

    private String name;

    private String isbn;
}
