package com.solutionesone.app.mapper;

import com.solutionesone.app.domain.entity.GetFormConfig;
import com.solutionesone.app.service.dto.GetFormConfigDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface GetFormConfigDTOMapper {

    static GetFormConfigDTOMapper getFormConfigDTOMapper = Mappers.getMapper(GetFormConfigDTOMapper.class);

    public List<GetFormConfig> toEntities(List<GetFormConfigDTO> getFormConfigDTOS);

    public List<GetFormConfigDTO> toDTOs(List<GetFormConfig> getFormConfigs);


}
