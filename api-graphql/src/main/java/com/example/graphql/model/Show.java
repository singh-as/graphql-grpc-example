package com.example.graphql.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Show {
    private final String title;
    private final Integer releaseYear;
}
