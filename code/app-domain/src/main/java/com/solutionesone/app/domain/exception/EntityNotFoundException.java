package com.solutionesone.app.domain.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;

@Data
@EqualsAndHashCode(callSuper = true)
public class EntityNotFoundException extends RuntimeException {
    private String code;

    public EntityNotFoundException(String code, String message) {
        super(message);
        this.code = code;
    }
}
