package com.example.documents.service;

import com.definition.grpc.document.Document;
import com.example.documents.entity.DocumentEntity;
import com.example.documents.repository.DocumentRepository;
import com.example.documents.service.impl.DocumentServiceImpl;
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
public class DocumentServiceImplTests {

    @Mock
    DocumentRepository documentRepository;

    @InjectMocks
    DocumentServiceImpl documentService;

    String[] titles = {"004S2C", "002IJ8"};
    List<String> docTitles = Arrays.asList(titles);

    @BeforeEach
    void mockOutput() {

        List<DocumentEntity> documents = new ArrayList<>(3);
        DocumentEntity doc1 = new DocumentEntity();
        doc1.setId(1L);
        doc1.setTitle("002IJ8");
        doc1.setDescription("Plan Summary");
        doc1.setPath("path/to/document/sbc/002IJ8.pdf");
        documents.add(doc1);

        DocumentEntity doc2 = new DocumentEntity();
        doc2.setId(2L);
        doc2.setTitle("004S2C");
        doc2.setDescription("Plan Summary");
        doc2.setPath("path/to/document/sbc/004S2C.pdf");
        documents.add(doc2);

        when(documentRepository.findByTitleIn(docTitles)).thenReturn(documents);
    }


    @Test
    void documentsByTitleInTest() {
        List<Document> documents = documentService.documentsByTitleIn(docTitles);
        Assertions.assertEquals(2, documents.size());
        documents.forEach(d -> Assertions.assertTrue(docTitles.contains(d.getTitle())));
    }
}
