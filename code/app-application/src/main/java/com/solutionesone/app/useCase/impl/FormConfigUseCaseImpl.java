package com.solutionesone.app.useCase.impl;

import com.solutionesone.app.domain.entity.FormConfig;
import com.solutionesone.app.domain.entity.GetFormConfig;
import com.solutionesone.app.domain.entity.repository.FormConfigRepository;
import com.solutionesone.app.useCase.FormConfigUseCase;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<FormConfig> getAll() {
        return formConfigRepository.findAll();
    }

    @Override
    public List<GetFormConfig> getFormConfig() {
        return formConfigRepository.findAllFormConfig();
    }

    @Override
    public FormConfig getById(String id) {
        return formConfigRepository.getById(id);
    }

    @Override
    public Void deleteById(String id) {
        return formConfigRepository.deleteById(id);
    }

    @Override
    public FormConfig update(FormConfig formConfig, String id) {
        return formConfigRepository.update(formConfig, id);
    }
}
