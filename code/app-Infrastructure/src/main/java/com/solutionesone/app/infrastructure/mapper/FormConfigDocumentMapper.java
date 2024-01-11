package com.solutionesone.app.infrastructure.mapper;

import com.solutionesone.app.domain.entity.FormConfig;
import com.solutionesone.app.infrastructure.document.FormConfigDocument;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface FormConfigDocumentMapper {

    FormConfigDocumentMapper formConfigDocumentMapper = Mappers.getMapper(FormConfigDocumentMapper.class);

    public FormConfigDocument toDocument(FormConfig formConfig);

    public FormConfig toEntity(FormConfigDocument formConfigDocument);

    public List<FormConfigDocument> toDocuments(List<FormConfig> formConfigs);

    public List<FormConfig> toEntities(List<FormConfigDocument> formConfigDocument);

}
