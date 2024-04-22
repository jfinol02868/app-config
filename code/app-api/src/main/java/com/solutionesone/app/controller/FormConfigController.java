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

import static com.solutionesone.app.mapper.FormConfigDTOMapper.formConfigDTOMapper;
import static com.solutionesone.app.mapper.GetFormConfigDTOMapper.getFormConfigDTOMapper;

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
                formConfigDTOMapper.toDTO(formConfigUseCase.save(formConfigDTOMapper.toEntity(formConfigDTO))),
                HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<List<FormConfigDTO>> getFormConfig() {
        return new ResponseEntity<>(formConfigDTOMapper.toDTOs(formConfigUseCase.getAll()),
                HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<GetFormConfigDTO>> getAllFormConfig() {
        return new ResponseEntity<>(getFormConfigDTOMapper.toDTOs(formConfigUseCase.getFormConfig()),
                HttpStatus.OK);
    }

    @Override
    public ResponseEntity<FormConfigDTO> getInputById(String id) {
        return new ResponseEntity<FormConfigDTO>(formConfigDTOMapper.toDTO(formConfigUseCase.getById(id)),
                HttpStatus.OK);
    }

    @Override
    public ResponseEntity<FormConfigDTO> updateFormConfig(FormConfigDTO formConfigDTO, String id) {
        return new ResponseEntity<FormConfigDTO>(formConfigDTOMapper.toDTO(
                formConfigUseCase.update(formConfigDTOMapper.toEntity(formConfigDTO), id)),
                HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Void> deleteInputById(String id) {
        return new ResponseEntity<>(formConfigUseCase.deleteById(id),
                HttpStatus.NO_CONTENT);
    }
}
