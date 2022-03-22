package com.example.graphql.grpc.client;

import com.definition.grpc.document.Document;
import com.definition.grpc.document.DocumentRequest;
import com.definition.grpc.document.DocumentResponse;
import com.definition.grpc.document.DocumentServiceGrpc;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class PlanDocumentGrpcClient {

    private static final String DOCUMENT_SVC = "documentSvc";
    private static final Document.Builder builder = Document.newBuilder()
                                                            .setDescription("Default SBC")
                                                            .setPath("/path/to/default.pdf");

    @GrpcClient(DOCUMENT_SVC)
    private DocumentServiceGrpc.DocumentServiceBlockingStub documentServiceBlockingStub;

    @CircuitBreaker(name=DOCUMENT_SVC, fallbackMethod="fallback")
    public List<Document> planDocuments(List<String> titles) {
        DocumentResponse response = documentServiceBlockingStub.getDocuments(DocumentRequest
                                                                                .newBuilder()
                                                                                .addAllTitle(titles)
                                                                                .build());
        return response.getDocumentList();
    }

    private List<Document> fallback(List<String> titles, Exception e) {
        return titles.stream().map(title -> builder.setTitle(title).build()).collect(Collectors.toList());
    }
}
