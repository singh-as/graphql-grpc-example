package com.example.graphql.model;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Builder
@Getter
public class Plan {
    private String code;
    private String name;
    private String benefitType;
    private String carrier;
    private PlanCost cost;
    private Document document;
    private List<PlanAttribute> attributes;
}
