package com.solutionesone.app.mapper;

import com.solutionesone.app.domain.entity.GetFormConfig;
import com.solutionesone.app.domain.entity.Input;
import com.solutionesone.app.service.dto.GetFormConfigDTO;
import com.solutionesone.app.service.dto.InputDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-12T02:48:37+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.9 (Private Build)"
)
public class GetFormConfigMapperImpl implements GetFormConfigMapper {

    @Override
    public List<GetFormConfig> toEntities(List<GetFormConfigDTO> getFormConfigDTOS) {
        if ( getFormConfigDTOS == null ) {
            return null;
        }

        List<GetFormConfig> list = new ArrayList<GetFormConfig>( getFormConfigDTOS.size() );
        for ( GetFormConfigDTO getFormConfigDTO : getFormConfigDTOS ) {
            list.add( getFormConfigDTOToGetFormConfig( getFormConfigDTO ) );
        }

        return list;
    }

    @Override
    public List<GetFormConfigDTO> toDTOs(List<GetFormConfig> getFormConfigs) {
        if ( getFormConfigs == null ) {
            return null;
        }

        List<GetFormConfigDTO> list = new ArrayList<GetFormConfigDTO>( getFormConfigs.size() );
        for ( GetFormConfig getFormConfig : getFormConfigs ) {
            list.add( getFormConfigToGetFormConfigDTO( getFormConfig ) );
        }

        return list;
    }

    protected Input inputDTOToInput(InputDTO inputDTO) {
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

    protected List<Input> inputDTOListToInputList(List<InputDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Input> list1 = new ArrayList<Input>( list.size() );
        for ( InputDTO inputDTO : list ) {
            list1.add( inputDTOToInput( inputDTO ) );
        }

        return list1;
    }

    protected GetFormConfig getFormConfigDTOToGetFormConfig(GetFormConfigDTO getFormConfigDTO) {
        if ( getFormConfigDTO == null ) {
            return null;
        }

        GetFormConfig.GetFormConfigBuilder getFormConfig = GetFormConfig.builder();

        getFormConfig.id( getFormConfigDTO.getId() );
        getFormConfig.configName( getFormConfigDTO.getConfigName() );
        getFormConfig.inputs( inputDTOListToInputList( getFormConfigDTO.getInputs() ) );

        return getFormConfig.build();
    }

    protected InputDTO inputToInputDTO(Input input) {
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

    protected List<InputDTO> inputListToInputDTOList(List<Input> list) {
        if ( list == null ) {
            return null;
        }

        List<InputDTO> list1 = new ArrayList<InputDTO>( list.size() );
        for ( Input input : list ) {
            list1.add( inputToInputDTO( input ) );
        }

        return list1;
    }

    protected GetFormConfigDTO getFormConfigToGetFormConfigDTO(GetFormConfig getFormConfig) {
        if ( getFormConfig == null ) {
            return null;
        }

        GetFormConfigDTO.GetFormConfigDTOBuilder getFormConfigDTO = GetFormConfigDTO.builder();

        getFormConfigDTO.id( getFormConfig.getId() );
        getFormConfigDTO.configName( getFormConfig.getConfigName() );
        getFormConfigDTO.inputs( inputListToInputDTOList( getFormConfig.getInputs() ) );

        return getFormConfigDTO.build();
    }
}
