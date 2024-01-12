package com.solutionesone.app.controller;

import com.solutionesone.app.service.FormConfigApi;
import com.solutionesone.app.service.dto.FormConfigDTO;
import com.solutionesone.app.service.dto.GetFormConfigDTO;
import com.solutionesone.app.useCase.FormConfigUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.solutionesone.app.mapper.FormConfigMapper.formConfigMapper;
import static com.solutionesone.app.mapper.GetFormConfigMapper.getFormConfigMapper;

@RestController
@RequestMapping("/formConfig")
public class FormConfigController implements FormConfigApi {

    private final FormConfigUseCase formConfigUseCase;

    public FormConfigController(FormConfigUseCase formConfigUseCase) {
        this.formConfigUseCase = formConfigUseCase;
    }

    @Override
    public ResponseEntity<FormConfigDTO> createFormConfig(FormConfigDTO formConfigDTO) {
        return new ResponseEntity<>(
                formConfigMapper.toDTO(formConfigUseCase.save(formConfigMapper.toEntity(formConfigDTO)))
                , HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<List<FormConfigDTO>> getFormConfig() {
        return new ResponseEntity<>(formConfigMapper.toDTOs(formConfigUseCase.getAll()), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<GetFormConfigDTO>> getAllFormConfig() {
        return new ResponseEntity<>(getFormConfigMapper.toDTOs(formConfigUseCase.getFormConfig()), HttpStatus.OK);
    }
}
