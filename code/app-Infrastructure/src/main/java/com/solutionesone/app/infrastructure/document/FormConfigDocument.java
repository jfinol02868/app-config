package com.solutionesone.app.infrastructure.document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;


@Data
@Builder
@AllArgsConstructor
@Document(collection = "formConfigs")
public class FormConfigDocument {

    @MongoId
    private final String id;
    private final String configName;
    private final List<String> inputs;

}
