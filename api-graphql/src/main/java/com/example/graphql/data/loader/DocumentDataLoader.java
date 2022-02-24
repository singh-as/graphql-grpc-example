package com.example.graphql.data.loader;

import com.definition.grpc.cost.PlanCost;
import com.definition.grpc.document.Document;
import com.example.graphql.grpc.client.PlanCostGrpcClient;
import com.example.graphql.grpc.client.PlanDocumentGrpcClient;
import com.netflix.graphql.dgs.DgsDataLoader;
import org.dataloader.BatchLoader;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

@DgsDataLoader(name="document")
public class DocumentDataLoader implements BatchLoader<String, Document> {

    @Autowired
    private PlanDocumentGrpcClient planDocumentGrpcClient;

    @Override
    public CompletionStage<List<Document>> load(List<String> titles) {
        return CompletableFuture.supplyAsync(() -> planDocumentGrpcClient.planDocuments(titles));
    }
}
