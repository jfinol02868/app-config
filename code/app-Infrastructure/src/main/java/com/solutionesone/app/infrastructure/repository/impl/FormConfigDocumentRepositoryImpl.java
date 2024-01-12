package com.solutionesone.app.infrastructure.repository.impl;

import com.solutionesone.app.domain.entity.FormConfig;
import com.solutionesone.app.domain.entity.GetFormConfig;
import com.solutionesone.app.domain.entity.repository.FormConfigRepository;
import com.solutionesone.app.infrastructure.repository.FormConfigDocumentRepository2;
import com.solutionesone.app.infrastructure.repository.GetFormConfigDocumentRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.solutionesone.app.infrastructure.mapper.FormConfigDocumentMapper.formConfigDocumentMapper;
import static com.solutionesone.app.infrastructure.mapper.GetFormConfigDocumentMapper.getFormConfigDocumentMapper;

@Repository
public class FormConfigDocumentRepositoryImpl implements FormConfigRepository {

    private final FormConfigDocumentRepository2 formConfigDocumentRepository;
    private final GetFormConfigDocumentRepository getFormConfigDocumentRepository;

    public FormConfigDocumentRepositoryImpl(FormConfigDocumentRepository2 formConfigDocumentRepository, GetFormConfigDocumentRepository getFormConfigDocumentRepository) {
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
        return formConfigDocumentMapper.toEntities(formConfigDocumentRepository.findAll());
    }

    @Override
    public List<GetFormConfig> findAllFormConfig() {
        return getFormConfigDocumentMapper.toEntities(getFormConfigDocumentRepository.findAll());
    }
}
