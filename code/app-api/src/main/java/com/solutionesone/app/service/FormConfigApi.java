package com.solutionesone.app.service;

import com.solutionesone.app.service.dto.FormConfigDTO;
import com.solutionesone.app.service.dto.GetFormConfigDTO;
import com.solutionesone.app.service.dto.InputDTO;
import com.solutionesone.app.service.dto.OperationResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "FormConfigs", description = "Crud for creating FormConfigs.")
public interface FormConfigApi {

    static final String CONTENT_RESPONSE = "application/json";

    @PostMapping
    @Operation(operationId = "CreateFormConfig", summary = "Create form formConfigs.")
    @ApiResponse(responseCode = "201", content = @Content(mediaType = CONTENT_RESPONSE, schema = @Schema(implementation = FormConfigDTO.class)))
    @ApiResponse(responseCode = "400", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    @ApiResponse(responseCode = "401", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    @ApiResponse(responseCode = "403", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    @ApiResponse(responseCode = "500", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    default ResponseEntity<FormConfigDTO> createFormConfig(@RequestBody FormConfigDTO formConfigDTO) {
        return new ResponseEntity<FormConfigDTO>(HttpStatus.NOT_IMPLEMENTED);
    }

    @GetMapping("/all")
    @Operation(operationId = "GetAllFormConfig", summary = "Get all formConfigs.")
    @ApiResponse(responseCode = "200", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = FormConfigDTO.class))))
    @ApiResponse(responseCode = "401", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    @ApiResponse(responseCode = "403", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    @ApiResponse(responseCode = "500", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    default ResponseEntity<List<FormConfigDTO>> getFormConfig() {
        return new ResponseEntity<List<FormConfigDTO>>(HttpStatus.NOT_IMPLEMENTED);
    }

    @GetMapping("/allConfigs")
    @Operation(operationId = "GetAllConfigurations", summary = "Get all configurations.")
    @ApiResponse(responseCode = "200", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = GetFormConfigDTO.class))))
    @ApiResponse(responseCode = "401", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    @ApiResponse(responseCode = "403", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    @ApiResponse(responseCode = "500", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    default ResponseEntity<List<GetFormConfigDTO>> getAllFormConfig() {
        return new ResponseEntity<List<GetFormConfigDTO>>(HttpStatus.NOT_IMPLEMENTED);
    }

    @GetMapping("/{id}")
    @Operation(operationId = "GetFormConfigById", summary = "Get formConfig by id.")
    @ApiResponse(responseCode = "200", content = @Content(mediaType = CONTENT_RESPONSE, schema = @Schema(implementation = FormConfigDTO.class)))
    @ApiResponse(responseCode = "400", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    @ApiResponse(responseCode = "401", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    @ApiResponse(responseCode = "403", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    @ApiResponse(responseCode = "404", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    @ApiResponse(responseCode = "500", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    default ResponseEntity<FormConfigDTO> getInputById(@PathVariable(name = "id", required = true) String id) {
        return new ResponseEntity<FormConfigDTO>(HttpStatus.NOT_IMPLEMENTED);
    }

    @PutMapping("/{id}")
    @Operation(operationId = "UpdateFormConfig", summary = "Update formConfig.")
    @ApiResponse(responseCode = "201", content = @Content(mediaType = CONTENT_RESPONSE, schema = @Schema(implementation = FormConfigDTO.class)))
    @ApiResponse(responseCode = "400", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    @ApiResponse(responseCode = "401", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    @ApiResponse(responseCode = "403", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    @ApiResponse(responseCode = "404", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    @ApiResponse(responseCode = "500", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    default ResponseEntity<FormConfigDTO> updateInput(@RequestBody FormConfigDTO formConfigDTO, @PathVariable String id) {
        return new ResponseEntity<FormConfigDTO>(HttpStatus.NOT_IMPLEMENTED);
    }

    @DeleteMapping("/{id}")
    @Operation(operationId = "DeleteFormConfigById", summary = "Delete formConfig by id.")
    @ApiResponse(responseCode = "204", content = @Content(mediaType = CONTENT_RESPONSE))
    @ApiResponse(responseCode = "400", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    @ApiResponse(responseCode = "401", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    @ApiResponse(responseCode = "403", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    @ApiResponse(responseCode = "404", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    @ApiResponse(responseCode = "500", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    default ResponseEntity<Void> deleteInputById(@PathVariable String id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}
