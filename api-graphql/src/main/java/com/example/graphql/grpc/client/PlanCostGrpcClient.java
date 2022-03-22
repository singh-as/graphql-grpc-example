package com.example.graphql.grpc.client;

import com.definition.grpc.cost.PlanCost;
import com.definition.grpc.cost.PlanCostRequest;
import com.definition.grpc.cost.PlanCostResponse;
import com.definition.grpc.cost.PlanCostServiceGrpc;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PlanCostGrpcClient {

    private static final String COST_SVC = "costSvc";
    private static final PlanCost.Builder builder = PlanCost.newBuilder().setEmplCovrgRate(0.0f).setEmplrCovrgRate(0.0f);

    @GrpcClient(COST_SVC)
    private PlanCostServiceGrpc.PlanCostServiceBlockingStub planCostServiceBlockingStub;

    @Retry(name = COST_SVC)
    @CircuitBreaker(name=COST_SVC, fallbackMethod = "fallback")
    public List<PlanCost> planCosts(List<String> codes) {
        PlanCostResponse response = planCostServiceBlockingStub.getPlanCost(PlanCostRequest
                                                                                .newBuilder()
                                                                                .addAllPlanCode(codes)
                                                                                .build());
        return response.getCostList();
    }

    private List<PlanCost> fallback(List<String> codes, Exception e) {
        return codes.stream().map(code -> builder.setPlanCode(code).build()).collect(Collectors.toList());
    }
}
