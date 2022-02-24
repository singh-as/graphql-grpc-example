package com.example.graphql.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PlanCost {
    private String planCode;
    private Float emplCovrgRate;
    private Float emplrCovrgRate;
}
