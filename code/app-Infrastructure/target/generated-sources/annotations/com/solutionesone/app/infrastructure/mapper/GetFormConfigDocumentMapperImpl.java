package com.solutionesone.app.infrastructure.mapper;

import com.solutionesone.app.domain.entity.GetFormConfig;
import com.solutionesone.app.domain.entity.Input;
import com.solutionesone.app.infrastructure.document.GetFormConfigDocument;
import com.solutionesone.app.infrastructure.document.InputDocument;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-11T20:21:05+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.10 (Private Build)"
)
public class GetFormConfigDocumentMapperImpl implements GetFormConfigDocumentMapper {

    @Override
    public List<GetFormConfigDocument> toDocument(List<GetFormConfig> getFormConfigs) {
        if ( getFormConfigs == null ) {
            return null;
        }

        List<GetFormConfigDocument> list = new ArrayList<GetFormConfigDocument>( getFormConfigs.size() );
        for ( GetFormConfig getFormConfig : getFormConfigs ) {
            list.add( getFormConfigToGetFormConfigDocument( getFormConfig ) );
        }

        return list;
    }

    @Override
    public List<GetFormConfig> toEntities(List<GetFormConfigDocument> formConfigDocuments) {
        if ( formConfigDocuments == null ) {
            return null;
        }

        List<GetFormConfig> list = new ArrayList<GetFormConfig>( formConfigDocuments.size() );
        for ( GetFormConfigDocument getFormConfigDocument : formConfigDocuments ) {
            list.add( getFormConfigDocumentToGetFormConfig( getFormConfigDocument ) );
        }

        return list;
    }

    protected InputDocument inputToInputDocument(Input input) {
        if ( input == null ) {
            return null;
        }

        InputDocument.InputDocumentBuilder inputDocument = InputDocument.builder();

        inputDocument.id( input.getId() );
        inputDocument.type( input.getType() );
        inputDocument.name( input.getName() );
        inputDocument.inputId( input.getInputId() );
        inputDocument.placeHolder( input.getPlaceHolder() );
        inputDocument.value( input.getValue() );
        inputDocument.minLength( input.getMinLength() );
        inputDocument.maxLength( input.getMaxLength() );
        inputDocument.pattern( input.getPattern() );
        inputDocument.max( input.getMax() );
        inputDocument.min( input.getMin() );
        inputDocument.alt( input.getAlt() );
        inputDocument.src( input.getSrc() );
        inputDocument.formTarget( input.getFormTarget() );
        inputDocument.action( input.getAction() );
        inputDocument.method( input.getMethod() );

        return inputDocument.build();
    }

    protected List<InputDocument> inputListToInputDocumentList(List<Input> list) {
        if ( list == null ) {
            return null;
        }

        List<InputDocument> list1 = new ArrayList<InputDocument>( list.size() );
        for ( Input input : list ) {
            list1.add( inputToInputDocument( input ) );
        }

        return list1;
    }

    protected GetFormConfigDocument getFormConfigToGetFormConfigDocument(GetFormConfig getFormConfig) {
        if ( getFormConfig == null ) {
            return null;
        }

        GetFormConfigDocument.GetFormConfigDocumentBuilder getFormConfigDocument = GetFormConfigDocument.builder();

        getFormConfigDocument.id( getFormConfig.getId() );
        getFormConfigDocument.configName( getFormConfig.getConfigName() );
        getFormConfigDocument.inputs( inputListToInputDocumentList( getFormConfig.getInputs() ) );

        return getFormConfigDocument.build();
    }

    protected Input inputDocumentToInput(InputDocument inputDocument) {
        if ( inputDocument == null ) {
            return null;
        }

        Input.InputBuilder input = Input.builder();

        input.id( inputDocument.getId() );
        input.type( inputDocument.getType() );
        input.name( inputDocument.getName() );
        input.inputId( inputDocument.getInputId() );
        input.placeHolder( inputDocument.getPlaceHolder() );
        input.value( inputDocument.getValue() );
        input.minLength( inputDocument.getMinLength() );
        input.maxLength( inputDocument.getMaxLength() );
        input.pattern( inputDocument.getPattern() );
        input.max( inputDocument.getMax() );
        input.min( inputDocument.getMin() );
        input.alt( inputDocument.getAlt() );
        input.src( inputDocument.getSrc() );
        input.formTarget( inputDocument.getFormTarget() );
        input.action( inputDocument.getAction() );
        input.method( inputDocument.getMethod() );

        return input.build();
    }

    protected List<Input> inputDocumentListToInputList(List<InputDocument> list) {
        if ( list == null ) {
            return null;
        }

        List<Input> list1 = new ArrayList<Input>( list.size() );
        for ( InputDocument inputDocument : list ) {
            list1.add( inputDocumentToInput( inputDocument ) );
        }

        return list1;
    }

    protected GetFormConfig getFormConfigDocumentToGetFormConfig(GetFormConfigDocument getFormConfigDocument) {
        if ( getFormConfigDocument == null ) {
            return null;
        }

        GetFormConfig.GetFormConfigBuilder getFormConfig = GetFormConfig.builder();

        getFormConfig.id( getFormConfigDocument.getId() );
        getFormConfig.configName( getFormConfigDocument.getConfigName() );
        getFormConfig.inputs( inputDocumentListToInputList( getFormConfigDocument.getInputs() ) );

        return getFormConfig.build();
    }
}
