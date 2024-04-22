package com.solutionesone.app.controller;

import com.solutionesone.app.service.InputApi;
import com.solutionesone.app.service.dto.InputDTO;
import com.solutionesone.app.useCase.InputUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.solutionesone.app.mapper.InputDTOMapper.inputDTOMapper;

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
                inputDTOMapper.toDTO(inputUseCase.create(inputDTOMapper.toEntity(inputDTO))), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<List<InputDTO>> getAllInputs() {
        return new ResponseEntity<List<InputDTO>>(inputDTOMapper.toDTOs(inputUseCase.getAllInputs()), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<InputDTO> getInputById(String id) {
        return new ResponseEntity<InputDTO>(inputDTOMapper.toDTO(inputUseCase.getInputById(id)), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> deleteInputById(String id) {
        return new ResponseEntity<Void>(inputUseCase.deleteInputById(id), HttpStatus.NO_CONTENT);
    }

    @Override
    public ResponseEntity<InputDTO> updateInput(InputDTO inputDTO, String id) {
        return new ResponseEntity<InputDTO>(
                inputDTOMapper.toDTO(inputUseCase.updateInput(id, inputDTOMapper.toEntity(inputDTO))), HttpStatus.CREATED);
    }
}
