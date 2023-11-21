package com.solutionesone.app.service;

import com.solutionesone.app.service.dto.InputDTO;
import com.solutionesone.app.service.dto.OperationResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface InputApi {

    static final String CONTENT_RESPONSE = "application/json";

    @PostMapping
    @ApiResponse(responseCode = "201", content = @Content(mediaType = CONTENT_RESPONSE, schema = @Schema(implementation = InputDTO.class)))
    @ApiResponse(responseCode = "400", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    @ApiResponse(responseCode = "401", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    @ApiResponse(responseCode = "403", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    @ApiResponse(responseCode = "500", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    default ResponseEntity<InputDTO> createInput(@RequestBody InputDTO inputDTO) {
        return new ResponseEntity<InputDTO>(HttpStatus.NOT_IMPLEMENTED);
    }

    @GetMapping("/all")
    @ApiResponse(responseCode = "200", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = InputDTO.class))))
    @ApiResponse(responseCode = "401", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    @ApiResponse(responseCode = "403", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    @ApiResponse(responseCode = "500", content = @Content(mediaType = CONTENT_RESPONSE, array = @ArraySchema(schema = @Schema(implementation = OperationResponse.class))))
    default ResponseEntity<List<InputDTO>> getAllInputs() {
        return new ResponseEntity<List<InputDTO>>(HttpStatus.NOT_IMPLEMENTED);
    }

    @GetMapping("/{id}")
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
