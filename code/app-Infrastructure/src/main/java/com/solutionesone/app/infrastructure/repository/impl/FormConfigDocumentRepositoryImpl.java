package com.solutionesone.app.infrastructure.repository.impl;

import com.solutionesone.app.domain.entity.FormConfig;
import com.solutionesone.app.domain.entity.repository.FormConfigRepository;
import com.solutionesone.app.infrastructure.repository.FormConfigDocumentRepository2;
import org.springframework.stereotype.Repository;

import static com.solutionesone.app.infrastructure.mapper.FormConfigDocumentMapper.formConfigDocumentMapper;

@Repository
public class FormConfigDocumentRepositoryImpl implements FormConfigRepository {

    private final FormConfigDocumentRepository2 formConfigDocumentRepository;

    public FormConfigDocumentRepositoryImpl(FormConfigDocumentRepository2 formConfigDocumentRepository) {
        this.formConfigDocumentRepository = formConfigDocumentRepository;
    }

    @Override
    public FormConfig save(FormConfig formConfig) {
        return formConfigDocumentMapper.toEntity(formConfigDocumentRepository.save(
        formConfigDocumentMapper.toDocument(formConfig)));
    }
}
