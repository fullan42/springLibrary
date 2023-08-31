package com.example.springlibrary.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateAuthorRequest {
    private String id;

    private String name;

    private String surname;
}
