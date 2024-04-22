package com.solutionesone.app.infrastructure.repository;

import com.solutionesone.app.infrastructure.document.GetFormConfigDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GetFormConfigDocumentRepository extends MongoRepository<GetFormConfigDocument, String> {
}
