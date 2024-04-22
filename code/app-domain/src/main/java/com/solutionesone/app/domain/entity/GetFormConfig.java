package com.solutionesone.app.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class GetFormConfig {

    private String id;
    private String configName;
    private List<Input> inputs;
}
