package com.solutionesone.app.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public interface InputApi {

    @GetMapping
    default ResponseEntity<String> sayHello() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}
