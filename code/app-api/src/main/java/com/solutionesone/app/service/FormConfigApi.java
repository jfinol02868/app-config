package com.solutionesone.app.service;

import com.solutionesone.app.service.dto.FormConfigDTO;
import com.solutionesone.app.service.dto.OperationResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Tag(name = "FormConfigs", description = "Crud for creating FormConfigs.")
public interface FormConfigApi {

    static final String CONTENT_RESPONSE = "application/json";

    @PostMapping
    @Operation(operationId = "Create-Input", summary = "Create inputs.")
    @ApiResponse(responseCode = "201", content = @Content(mediaType = CONTENT_RESPONSE, schema = @Schema(implementation = FormConfigDTO.class)))
    @ApiResponse(responseCode = "400", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    @ApiResponse(responseCode = "401", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    @ApiResponse(responseCode = "403", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    @ApiResponse(responseCode = "500", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    default ResponseEntity<FormConfigDTO> createInput(@RequestBody FormConfigDTO formConfigDTO) {
        return new ResponseEntity<FormConfigDTO>(HttpStatus.NOT_IMPLEMENTED);
    }
}
