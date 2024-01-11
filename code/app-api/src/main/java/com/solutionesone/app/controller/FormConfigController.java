package com.solutionesone.app.controller;

import com.solutionesone.app.mapper.FormConfigMapper;
import com.solutionesone.app.service.FormConfigApi;
import com.solutionesone.app.service.dto.FormConfigDTO;
import com.solutionesone.app.useCase.FormConfigUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/formConfig")
public class FormConfigController implements FormConfigApi {

    private final FormConfigUseCase formConfigUseCase;

    public FormConfigController(FormConfigUseCase formConfigUseCase) {
        this.formConfigUseCase = formConfigUseCase;
    }

    @Override
    public ResponseEntity<FormConfigDTO> createInput(FormConfigDTO formConfigDTO) {
        return new ResponseEntity<>(
                FormConfigMapper.formConfigMapper.toDTO(formConfigUseCase.save(FormConfigMapper.formConfigMapper.toEntity(formConfigDTO)))
                , HttpStatus.CREATED);
    }
}
