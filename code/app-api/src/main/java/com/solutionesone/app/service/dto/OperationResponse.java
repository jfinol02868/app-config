package com.solutionesone.app.service.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class OperationResponse implements Serializable {

    @Schema(example = "E0001")
    private String code;
    @Schema(example = "Operation message.")
    private String message;

}
