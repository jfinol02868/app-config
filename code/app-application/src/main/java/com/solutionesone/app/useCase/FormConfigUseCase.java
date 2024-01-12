package com.solutionesone.app.useCase;

import com.solutionesone.app.domain.entity.FormConfig;
import com.solutionesone.app.domain.entity.GetFormConfig;

import java.util.List;

public interface FormConfigUseCase {

    public FormConfig save(FormConfig formConfig);

    public List<FormConfig> getAll();

    public List<GetFormConfig> getFormConfig();
}
