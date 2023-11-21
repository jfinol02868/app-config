package com.solutionesone.app.controller;

import com.solutionesone.app.service.InputApi;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inputs")
public class InputController implements InputApi {

    @Override
    public ResponseEntity<String> sayHello() {
        return new ResponseEntity<>("Hello World ...", HttpStatus.OK);
    }
}
