package com.example.graphql.service;

import com.example.graphql.entity.PlanEntity;
import com.example.graphql.model.Plan;
import com.example.graphql.model.PlanAttribute;

import java.util.List;

public interface PlanService {
    List<PlanEntity> plans(List<String> codes);
}
