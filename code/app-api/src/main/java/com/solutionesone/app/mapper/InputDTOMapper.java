package com.solutionesone.app.mapper;

import com.solutionesone.app.domain.entity.Input;
import com.solutionesone.app.service.dto.InputDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface InputDTOMapper {

    static InputDTOMapper inputDTOMapper = Mappers.getMapper(InputDTOMapper.class);

    public InputDTO toDTO(Input input);

    public Input toEntity(InputDTO inputDTO);

    public List<InputDTO> toDTOs(List<Input> inputs);

    public List<Input> toEntities(List<InputDTO> inputDTOs);
}
