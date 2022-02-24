package com.example.graphql.grpc.client;

import com.definition.grpc.document.Document;
import com.definition.grpc.document.DocumentRequest;
import com.definition.grpc.document.DocumentResponse;
import com.definition.grpc.document.DocumentServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PlanDocumentGrpcClient {

    @GrpcClient("document-service")
    private DocumentServiceGrpc.DocumentServiceBlockingStub documentServiceBlockingStub;

    public List<Document> planDocuments(List<String> titles) {
        DocumentResponse response = documentServiceBlockingStub.getDocuments(DocumentRequest
                                                                                .newBuilder()
                                                                                .addAllTitle(titles)
                                                                                .build());
        return response.getDocumentList();
    }
}
