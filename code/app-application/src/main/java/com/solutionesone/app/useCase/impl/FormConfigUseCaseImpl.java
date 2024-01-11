package com.solutionesone.app.useCase.impl;

import com.solutionesone.app.domain.entity.FormConfig;
import com.solutionesone.app.domain.entity.repository.FormConfigRepository;
import com.solutionesone.app.useCase.FormConfigUseCase;
import org.springframework.stereotype.Service;

@Service
public class FormConfigUseCaseImpl implements FormConfigUseCase {

    private final FormConfigRepository formConfigRepository;

    public FormConfigUseCaseImpl(FormConfigRepository formConfigRepository) {
        this.formConfigRepository = formConfigRepository;
    }

    @Override
    public FormConfig save(FormConfig formConfig) {
        return formConfigRepository.save(formConfig);
    }
}
