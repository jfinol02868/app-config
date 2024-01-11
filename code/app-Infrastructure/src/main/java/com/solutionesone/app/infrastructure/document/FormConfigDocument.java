package com.solutionesone.app.infrastructure.document;

import lombok.Builder;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;

@Builder
@Document(collection = "formConfigs")
public record FormConfigDocument(
        @MongoId
        String id,
        String configName,
        //@DocumentReference(collection = "inputs")
        List<String> inputIds
) {}
