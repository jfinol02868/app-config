package com.solutionesone.app.domain.entity.repository;

import com.solutionesone.app.domain.entity.FormConfig;
import com.solutionesone.app.domain.entity.GetFormConfig;

import java.util.List;

public interface FormConfigRepository {

    public FormConfig save(FormConfig formConfig);

    public List<FormConfig> findAll();

    public List<GetFormConfig> findAllFormConfig();
}
