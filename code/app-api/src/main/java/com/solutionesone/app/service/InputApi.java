package com.solutionesone.app.service;

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

@Tag(name = "Inputs", description = "Crud for creating inputs.")
public interface InputApi {

    static final String CONTENT_RESPONSE = "application/json";

    @PostMapping
    @Operation(operationId = "Create-Input", summary = "Create inputs.")
    @ApiResponse(responseCode = "201", content = @Content(mediaType = CONTENT_RESPONSE, schema = @Schema(implementation = InputDTO.class)))
    @ApiResponse(responseCode = "400", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    @ApiResponse(responseCode = "401", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    @ApiResponse(responseCode = "403", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    @ApiResponse(responseCode = "500", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    default ResponseEntity<InputDTO> createInput(@RequestBody InputDTO inputDTO) {
        return new ResponseEntity<InputDTO>(HttpStatus.NOT_IMPLEMENTED);
    }

    @GetMapping("/all")
    @Operation(operationId = "Get-All-Inputs", summary = "Get all inputs.")
    @ApiResponse(responseCode = "200", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = InputDTO.class))))
    @ApiResponse(responseCode = "401", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    @ApiResponse(responseCode = "403", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    @ApiResponse(responseCode = "500", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    default ResponseEntity<List<InputDTO>> getAllInputs() {
        return new ResponseEntity<List<InputDTO>>(HttpStatus.NOT_IMPLEMENTED);
    }

    @GetMapping("/{id}")
    @Operation(operationId = "Get-Input-By-Id", summary = "Get input by id.")
    @ApiResponse(responseCode = "200", content = @Content(mediaType = CONTENT_RESPONSE, schema = @Schema(implementation = InputDTO.class)))
    @ApiResponse(responseCode = "400", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    @ApiResponse(responseCode = "401", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    @ApiResponse(responseCode = "403", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    @ApiResponse(responseCode = "404", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    @ApiResponse(responseCode = "500", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    default ResponseEntity<List<InputDTO>> getInputById(@PathVariable(name = "id", required = true) String id) {
        return new ResponseEntity<List<InputDTO>>(HttpStatus.NOT_IMPLEMENTED);
    }

    @PutMapping("/{id}")
    @Operation(operationId = "Update-Input", summary = "Update input.")
    @ApiResponse(responseCode = "201", content = @Content(mediaType = CONTENT_RESPONSE, schema = @Schema(implementation = InputDTO.class)))
    @ApiResponse(responseCode = "400", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    @ApiResponse(responseCode = "401", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    @ApiResponse(responseCode = "403", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    @ApiResponse(responseCode = "404", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    @ApiResponse(responseCode = "500", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    default ResponseEntity<List<InputDTO>> updateInput(@RequestBody InputDTO inputDTO) {
        return new ResponseEntity<List<InputDTO>>(HttpStatus.NOT_IMPLEMENTED);
    }

    @DeleteMapping("/{id}")
    @Operation(operationId = "Delete-Input-By-Id", summary = "Delete input by id.")
    @ApiResponse(responseCode = "204", content = @Content(mediaType = CONTENT_RESPONSE))
    @ApiResponse(responseCode = "400", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    @ApiResponse(responseCode = "401", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    @ApiResponse(responseCode = "403", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    @ApiResponse(responseCode = "404", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    @ApiResponse(responseCode = "500", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    default ResponseEntity<List<InputDTO>> deleteInputById(@PathVariable String id) {
        return new ResponseEntity<List<InputDTO>>(HttpStatus.NOT_IMPLEMENTED);
    }
}
