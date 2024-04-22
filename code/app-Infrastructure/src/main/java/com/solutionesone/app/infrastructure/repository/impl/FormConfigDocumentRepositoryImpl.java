package com.solutionesone.app.infrastructure.repository.impl;

import com.solutionesone.app.domain.entity.FormConfig;
import com.solutionesone.app.domain.entity.GetFormConfig;
import com.solutionesone.app.domain.entity.repository.FormConfigRepository;
import com.solutionesone.app.domain.exception.EntityNotFoundException;
import com.solutionesone.app.infrastructure.document.FormConfigDocument;
import com.solutionesone.app.infrastructure.repository.FormConfigDocumentRepository2;
import com.solutionesone.app.infrastructure.repository.GetFormConfigDocumentRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static com.solutionesone.app.infrastructure.mapper.FormConfigDocumentMapper.formConfigDocumentMapper;
import static com.solutionesone.app.infrastructure.mapper.GetFormConfigDocumentMapper.getFormConfigDocumentMapper;

@Repository
public class FormConfigDocumentRepositoryImpl implements FormConfigRepository {

    private final FormConfigDocumentRepository2 formConfigDocumentRepository;
    private final GetFormConfigDocumentRepository getFormConfigDocumentRepository;

    public FormConfigDocumentRepositoryImpl(
            FormConfigDocumentRepository2 formConfigDocumentRepository,
            GetFormConfigDocumentRepository getFormConfigDocumentRepository) {
        this.formConfigDocumentRepository = formConfigDocumentRepository;
        this.getFormConfigDocumentRepository = getFormConfigDocumentRepository;
    }

    @Override
    public FormConfig save(FormConfig formConfig) {
        return formConfigDocumentMapper.toEntity(formConfigDocumentRepository.save(
        formConfigDocumentMapper.toDocument(formConfig)));
    }

    @Override
    public List<FormConfig> findAll() {
        return formConfigDocumentMapper.toEntities(
                formConfigDocumentRepository.findAll());
    }

    @Override
    public List<GetFormConfig> findAllFormConfig() {
        return getFormConfigDocumentMapper.toEntities(
                getFormConfigDocumentRepository.findAll());
    }

    @Override
    public FormConfig getById(String id) {
        Optional<FormConfigDocument> formConfig = formConfigDocumentRepository.findById(id);
        if(formConfig.isEmpty()) {
            throw new EntityNotFoundException("N100", "Registro no encontrado");
        }
        return formConfigDocumentMapper.toEntity(formConfig.get());
    }

    @Override
    public Void deleteById(String id) {
        formConfigDocumentRepository.deleteById(id);
        return null;
    }

    @Override
    public FormConfig update(FormConfig formConfig, String id) {
        FormConfig formConfigResponse = this.getById(id);
        BeanUtils.copyProperties(formConfig, formConfigResponse);
        return formConfigDocumentMapper.toEntity(formConfigDocumentRepository.save(
                formConfigDocumentMapper.toDocument(formConfigResponse)));
    }
}
