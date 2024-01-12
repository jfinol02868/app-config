package com.solutionesone.app.mapper;

import com.solutionesone.app.domain.entity.FormConfig;
import com.solutionesone.app.service.dto.FormConfigDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface FormConfigMapper {

    static  FormConfigMapper formConfigMapper = Mappers.getMapper(FormConfigMapper.class);

    public FormConfig toEntity(FormConfigDTO formConfigDTO);

    public FormConfigDTO toDTO(FormConfig formConfig);

    public List<FormConfig> toEntities(List<FormConfigDTO> formConfigDTOs);

    public List<FormConfigDTO> toDTOs(List<FormConfig> formConfigs);


}
