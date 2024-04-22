package com.solutionesone.app.infrastructure.repository;

import com.solutionesone.app.infrastructure.document.InputDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InputDocumentRepository extends MongoRepository<InputDocument, String> {

}
