package com.example.documents.service;

import com.definition.grpc.document.Document;

import java.util.List;

public interface DocumentService {
    List<Document> documentsByTitleIn(List<String> titles);
}
