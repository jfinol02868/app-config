package com.solutionesone.app.service.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class InputDTO implements Serializable {

    @NotNull
    private String id;
    @NotNull
    @Schema(example = "text")
    private String type;
    @Schema(example = "name")
    private String name;
    @Schema(example = "idOfName-01")
    private String inputId;
    @Schema(example = "Name")
    private String placeHolder;
    @Schema(example = "send")
    private String value;
    @Schema(example = "0", defaultValue = "0")
    private String minLength;
    @Schema(example = "50")
    private String maxLength;
    @Schema(example = "A-Za-z]{3}")
    private String pattern;
    @Schema(example = "1979-12-31")
    private String max;
    @Schema(example = "000-01-02")
    private String min;
    @Schema(example = "Send")
    private String alt;
    @Schema(example = "www.google.com")
    private String src;
    @Schema(example = "_blank")
    private String formTarget;
    @Schema(example = "/action_page.php")
    private String action;
    @Schema(example = "GET")
    private String method;
}
