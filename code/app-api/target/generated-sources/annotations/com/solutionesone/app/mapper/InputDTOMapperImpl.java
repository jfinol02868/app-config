package com.solutionesone.app.mapper;

import com.solutionesone.app.domain.entity.Input;
import com.solutionesone.app.service.dto.InputDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-19T16:36:43+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.9 (Private Build)"
)
public class InputDTOMapperImpl implements InputDTOMapper {

    @Override
    public InputDTO toDTO(Input input) {
        if ( input == null ) {
            return null;
        }

        InputDTO.InputDTOBuilder inputDTO = InputDTO.builder();

        inputDTO.id( input.getId() );
        inputDTO.type( input.getType() );
        inputDTO.name( input.getName() );
        inputDTO.inputId( input.getInputId() );
        inputDTO.placeHolder( input.getPlaceHolder() );
        inputDTO.value( input.getValue() );
        inputDTO.minLength( input.getMinLength() );
        inputDTO.maxLength( input.getMaxLength() );
        inputDTO.pattern( input.getPattern() );
        inputDTO.max( input.getMax() );
        inputDTO.min( input.getMin() );
        inputDTO.alt( input.getAlt() );
        inputDTO.src( input.getSrc() );
        inputDTO.formTarget( input.getFormTarget() );
        inputDTO.action( input.getAction() );
        inputDTO.method( input.getMethod() );

        return inputDTO.build();
    }

    @Override
    public Input toEntity(InputDTO inputDTO) {
        if ( inputDTO == null ) {
            return null;
        }

        Input.InputBuilder input = Input.builder();

        input.id( inputDTO.getId() );
        input.type( inputDTO.getType() );
        input.name( inputDTO.getName() );
        input.inputId( inputDTO.getInputId() );
        input.placeHolder( inputDTO.getPlaceHolder() );
        input.value( inputDTO.getValue() );
        input.minLength( inputDTO.getMinLength() );
        input.maxLength( inputDTO.getMaxLength() );
        input.pattern( inputDTO.getPattern() );
        input.max( inputDTO.getMax() );
        input.min( inputDTO.getMin() );
        input.alt( inputDTO.getAlt() );
        input.src( inputDTO.getSrc() );
        input.formTarget( inputDTO.getFormTarget() );
        input.action( inputDTO.getAction() );
        input.method( inputDTO.getMethod() );

        return input.build();
    }

    @Override
    public List<InputDTO> toDTOs(List<Input> inputs) {
        if ( inputs == null ) {
            return null;
        }

        List<InputDTO> list = new ArrayList<InputDTO>( inputs.size() );
        for ( Input input : inputs ) {
            list.add( toDTO( input ) );
        }

        return list;
    }

    @Override
    public List<Input> toEntities(List<InputDTO> inputDTOs) {
        if ( inputDTOs == null ) {
            return null;
        }

        List<Input> list = new ArrayList<Input>( inputDTOs.size() );
        for ( InputDTO inputDTO : inputDTOs ) {
            list.add( toEntity( inputDTO ) );
        }

        return list;
    }
}
