package com.solutionesone.app.mapper;

import com.solutionesone.app.domain.entity.Input;
import com.solutionesone.app.service.dto.InputDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface InputMapper {

    static InputMapper inputMapper = Mappers.getMapper(InputMapper.class);

    public InputDTO toDTO(Input input);

    public Input toEntity(InputDTO inputDTO);
}
