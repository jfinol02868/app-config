package com.solutionesone.app.infrastructure.mapper;

import com.solutionesone.app.domain.entity.GetFormConfig;
import com.solutionesone.app.infrastructure.document.GetFormConfigDocument;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface GetFormConfigDocumentMapper {

    static GetFormConfigDocumentMapper getFormConfigDocumentMapper = Mappers.getMapper(GetFormConfigDocumentMapper.class);

    public List<GetFormConfigDocument> toDocument(List<GetFormConfig> getFormConfigs);

    public List<GetFormConfig> toEntities(List<GetFormConfigDocument> formConfigDocuments);


}
