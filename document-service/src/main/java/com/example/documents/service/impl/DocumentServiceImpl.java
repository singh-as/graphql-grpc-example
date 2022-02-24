package com.example.documents.service.impl;

import com.definition.grpc.document.Document;
import com.example.documents.entity.DocumentEntity;
import com.example.documents.repository.DocumentRepository;
import com.example.documents.service.DocumentService;
import com.example.transform.PojoProtoUtil;
import com.google.protobuf.InvalidProtocolBufferException;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Log4j2
public class DocumentServiceImpl implements DocumentService {

    @Autowired
    private DocumentRepository documentRepository;

    @Override
    public List<Document> documentsByTitleIn(List<String> titles) {
        List<DocumentEntity> entities = documentRepository.findByTitleIn(titles);
        List<Document> list = new ArrayList(entities.size());
        for (DocumentEntity doc : entities) {
            try {
                Document.Builder builder = Document.newBuilder();
                PojoProtoUtil.toProto(doc, builder);
                list.add(builder.build());
            } catch (InvalidProtocolBufferException invalidProtocolBufferException) {
                log.error(invalidProtocolBufferException);
            }
        }
        return list;
    }
}
