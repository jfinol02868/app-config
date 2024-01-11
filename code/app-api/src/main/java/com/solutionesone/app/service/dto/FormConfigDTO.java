package com.solutionesone.app.service.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

import java.util.List;

@Builder
public record FormConfigDTO(
        @NotNull
        @Schema(example = "768756453434565")
        @JsonProperty(access = JsonProperty.Access.READ_ONLY)
        String id,
        @Schema(example = "Config login")
        String configName,
        @Schema(type = "array", example = "[\"1\",\"2\",\"3\"]")
        List<String> inputIds
) {}
