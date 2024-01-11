package com.solutionesone.app.infrastructure.document;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@Document(value = "inputs")
public class InputDocument implements Serializable {

    @MongoId
    private String id;
    private String type;
    private String name;
    private String inputId;
    private String placeHolder;
    private String value;
    private String minLength;
    private String maxLength;
    private String pattern;
    private String max;
    private String min;
    private String alt;
    private String src;
    private String formTarget;
    private String action;
    private String method;
}
