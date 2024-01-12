package com.solutionesone.app.infrastructure.mapper;

import com.solutionesone.app.domain.entity.FormConfig;
import com.solutionesone.app.infrastructure.document.FormConfigDocument;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-12T01:46:56+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.9 (Private Build)"
)
public class FormConfigDocumentMapperImpl implements FormConfigDocumentMapper {

    @Override
    public FormConfigDocument toDocument(FormConfig formConfig) {
        if ( formConfig == null ) {
            return null;
        }

        FormConfigDocument.FormConfigDocumentBuilder formConfigDocument = FormConfigDocument.builder();

        formConfigDocument.id( formConfig.getId() );
        formConfigDocument.configName( formConfig.getConfigName() );
        List<String> list = formConfig.getInputs();
        if ( list != null ) {
            formConfigDocument.inputs( new ArrayList<String>( list ) );
        }

        return formConfigDocument.build();
    }

    @Override
    public FormConfig toEntity(FormConfigDocument formConfigDocument) {
        if ( formConfigDocument == null ) {
            return null;
        }

        FormConfig.FormConfigBuilder formConfig = FormConfig.builder();

        formConfig.id( formConfigDocument.getId() );
        formConfig.configName( formConfigDocument.getConfigName() );
        List<String> list = formConfigDocument.getInputs();
        if ( list != null ) {
            formConfig.inputs( new ArrayList<String>( list ) );
        }

        return formConfig.build();
    }

    @Override
    public List<FormConfigDocument> toDocuments(List<FormConfig> formConfigs) {
        if ( formConfigs == null ) {
            return null;
        }

        List<FormConfigDocument> list = new ArrayList<FormConfigDocument>( formConfigs.size() );
        for ( FormConfig formConfig : formConfigs ) {
            list.add( toDocument( formConfig ) );
        }

        return list;
    }

    @Override
    public List<FormConfig> toEntities(List<FormConfigDocument> formConfigDocument) {
        if ( formConfigDocument == null ) {
            return null;
        }

        List<FormConfig> list = new ArrayList<FormConfig>( formConfigDocument.size() );
        for ( FormConfigDocument formConfigDocument1 : formConfigDocument ) {
            list.add( toEntity( formConfigDocument1 ) );
        }

        return list;
    }
}
