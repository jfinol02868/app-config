package com.solutionesone.app.exception;

import com.solutionesone.app.domain.exception.EntityNotFoundException;
import com.solutionesone.app.service.dto.OperationResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.List;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({ EntityNotFoundException.class })
    public ResponseEntity<List<OperationResponse>> handleAEntityNotFoundException(EntityNotFoundException ex) {
        return new ResponseEntity<List<OperationResponse>>(List.of(
                    OperationResponse.builder()
                            .code(ex.getCode())
                            .message(ex.getMessage())
                            .build()
                ), HttpStatus.NOT_FOUND);
    }
}
