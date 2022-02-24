package com.example.cost.service;

import com.definition.grpc.cost.PlanCost;
import com.example.cost.entity.CostEntity;
import com.example.cost.repository.CostRepository;
import com.example.cost.service.impl.PlanCostServicempl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PlanCostServicemplTests {

    @Mock
    CostRepository costRepository;

    @InjectMocks
    PlanCostServicempl planCostService;

    String[] titles = {"004S2C", "002IJ8"};
    List<String> planCodes = Arrays.asList(titles);

    @BeforeEach
    void mockOutput() {

        List<CostEntity> planCosts = new ArrayList<>(2);
        CostEntity planCost1 = new CostEntity();
        planCost1.setId(1L);
        planCost1.setPlanCode("002IJ8");
        planCost1.setEmplCovrgRate(20f);
        planCost1.setEmplrCovrgRate(500f);
        planCosts.add(planCost1);

        CostEntity planCost2 = new CostEntity();
        planCost2.setId(2L);
        planCost2.setPlanCode("004S2C");
        planCost2.setEmplCovrgRate(100f);
        planCost2.setEmplrCovrgRate(300f);
        planCosts.add(planCost2);

        when(costRepository.findByPlanCodeIn(planCodes)).thenReturn(planCosts);
    }


    @Test
    void planCostsTest() {
        List<PlanCost> documents = planCostService.planCosts(planCodes);
        Assertions.assertEquals(2, documents.size());
        documents.forEach(cost -> Assertions.assertTrue(planCodes.contains(cost.getPlanCode())));
    }
}

