package com.example.cost.service;

import com.definition.grpc.cost.PlanCost;

import java.util.List;

public interface PlanCostService {

    List<PlanCost> planCosts(List<String> codes);
}
