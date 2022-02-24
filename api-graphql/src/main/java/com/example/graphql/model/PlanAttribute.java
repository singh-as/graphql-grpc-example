package com.example.graphql.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@RequiredArgsConstructor
public class PlanAttribute {
    private final String name;
    private final String value;
}
