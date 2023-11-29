package com.solutionesone.app.infrastructure.document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
public class InputDocument implements Serializable {

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
