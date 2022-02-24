package com.example.graphql.data.loader;

import com.definition.grpc.cost.PlanCost;
import com.example.graphql.grpc.client.PlanCostGrpcClient;
import com.netflix.graphql.dgs.DgsDataLoader;

import org.dataloader.BatchLoader;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

@DgsDataLoader(name="cost")
public class CostDataLoader implements BatchLoader<String, PlanCost> {

    @Autowired
    private PlanCostGrpcClient planCostGrpcClient;

    @Override
    public CompletionStage<List<PlanCost>> load(List<String> codes) {
        return CompletableFuture.supplyAsync(() -> planCostGrpcClient.planCosts(codes));
    }
}
