package com.example.documents.grpc.service;

import com.definition.grpc.document.DocumentRequest;
import com.definition.grpc.document.DocumentResponse;
import com.definition.grpc.document.DocumentServiceGrpc;
import com.example.documents.service.DocumentService;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@GrpcService
public class DocumentGrpcServiceImpl extends DocumentServiceGrpc.DocumentServiceImplBase {

    @Autowired
    private DocumentService service;

    @Override
    public void getDocuments(DocumentRequest request, StreamObserver<DocumentResponse> responseObserver) {
        List<String> titles = request.getTitleList();
        responseObserver.onNext(DocumentResponse.newBuilder()
                                                .addAllDocument(service.documentsByTitleIn(titles))
                                                .build());
        responseObserver.onCompleted();
    }
}
