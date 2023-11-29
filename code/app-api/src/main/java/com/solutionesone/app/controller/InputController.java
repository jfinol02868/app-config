package com.solutionesone.app.controller;

import com.solutionesone.app.service.InputApi;
import com.solutionesone.app.service.dto.InputDTO;
import com.solutionesone.app.useCase.InputUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.solutionesone.app.mapper.InputMapper.inputMapper;

@RestController
@RequestMapping("/inputs")
public class InputController implements InputApi {

    private final InputUseCase inputUseCase;

    public InputController(InputUseCase inputUseCase) {
        this.inputUseCase = inputUseCase;
    }

    @Override
    public ResponseEntity<InputDTO> createInput(InputDTO inputDTO) {
        return new ResponseEntity<InputDTO>(
                inputMapper.toDTO(inputUseCase.create(inputMapper.toEntity(inputDTO))), HttpStatus.CREATED);
    }
}
