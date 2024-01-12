package com.solutionesone.app.mapper;

import com.solutionesone.app.domain.entity.FormConfig;
import com.solutionesone.app.service.dto.FormConfigDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-12T02:48:37+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.9 (Private Build)"
)
public class FormConfigMapperImpl implements FormConfigMapper {

    @Override
    public FormConfig toEntity(FormConfigDTO formConfigDTO) {
        if ( formConfigDTO == null ) {
            return null;
        }

        FormConfig.FormConfigBuilder formConfig = FormConfig.builder();

        formConfig.id( formConfigDTO.getId() );
        formConfig.configName( formConfigDTO.getConfigName() );
        List<String> list = formConfigDTO.getInputs();
        if ( list != null ) {
            formConfig.inputs( new ArrayList<String>( list ) );
        }

        return formConfig.build();
    }

    @Override
    public FormConfigDTO toDTO(FormConfig formConfig) {
        if ( formConfig == null ) {
            return null;
        }

        FormConfigDTO.FormConfigDTOBuilder formConfigDTO = FormConfigDTO.builder();

        formConfigDTO.id( formConfig.getId() );
        formConfigDTO.configName( formConfig.getConfigName() );
        List<String> list = formConfig.getInputs();
        if ( list != null ) {
            formConfigDTO.inputs( new ArrayList<String>( list ) );
        }

        return formConfigDTO.build();
    }

    @Override
    public List<FormConfig> toEntities(List<FormConfigDTO> formConfigDTOs) {
        if ( formConfigDTOs == null ) {
            return null;
        }

        List<FormConfig> list = new ArrayList<FormConfig>( formConfigDTOs.size() );
        for ( FormConfigDTO formConfigDTO : formConfigDTOs ) {
            list.add( toEntity( formConfigDTO ) );
        }

        return list;
    }

    @Override
    public List<FormConfigDTO> toDTOs(List<FormConfig> formConfigs) {
        if ( formConfigs == null ) {
            return null;
        }

        List<FormConfigDTO> list = new ArrayList<FormConfigDTO>( formConfigs.size() );
        for ( FormConfig formConfig : formConfigs ) {
            list.add( toDTO( formConfig ) );
        }

        return list;
    }
}
