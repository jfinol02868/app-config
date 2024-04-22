package com.solutionesone.app.infrastructure.document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@Document(collection = "formConfigs")
public class GetFormConfigDocument {

  @MongoId
  private String id;
  private String configName;
  @DocumentReference(collection = "inputs", lazy = true)
  private List<InputDocument> inputs;
}
