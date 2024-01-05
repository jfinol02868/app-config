package com.solutionesone.app.infrastructure.mapper;

import com.solutionesone.app.infrastructure.document.InputDocument;
import com.solutionesone.app.domain.entity.Input;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface InputMapper {

    static InputMapper inputMapper = Mappers.getMapper(InputMapper.class);

    public InputDocument toDocument(Input input);

    public Input toEntity(InputDocument inputDocument);

    public List<InputDocument> toDocuments(List<Input> inputs);

    public List<Input> toEntities(List<InputDocument> inputDocuments);
}
