package com.solutionesone.app.service.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class FormConfigDTO {

        @NotNull
        @Schema(example = "768756453434565")
        @JsonProperty(access = JsonProperty.Access.READ_ONLY)
        private final String id;
        @Schema(example = "Config login")
        private final String configName;
        @ArraySchema(schema = @Schema(implementation = String.class))
        private final List<String> inputs;
}
