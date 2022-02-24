package com.example.graphql.grpc.client;

import com.definition.grpc.cost.PlanCost;
import com.definition.grpc.cost.PlanCostRequest;
import com.definition.grpc.cost.PlanCostResponse;
import com.definition.grpc.cost.PlanCostServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PlanCostGrpcClient {

    @GrpcClient("cost-service")
    private PlanCostServiceGrpc.PlanCostServiceBlockingStub planCostServiceBlockingStub;

    public List<PlanCost> planCosts(List<String> codes) {
        PlanCostResponse response = planCostServiceBlockingStub.getPlanCost(PlanCostRequest
                                                                                .newBuilder()
                                                                                .addAllPlanCode(codes)
                                                                                .build());
        return response.getCostList();
    }
}
