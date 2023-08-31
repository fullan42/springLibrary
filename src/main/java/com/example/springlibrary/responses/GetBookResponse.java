package com.example.springlibrary.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetBookResponse {
    private String id;

    private String name;

    private String isbn;
}
