package com.solutionesone.app.infrastructure.mapper;

import com.solutionesone.app.domain.entity.Input;
import com.solutionesone.app.infrastructure.document.InputDocument;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-11T20:21:05+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.10 (Private Build)"
)
public class InputDocumentMapperImpl implements InputDocumentMapper {

    @Override
    public InputDocument toDocument(Input input) {
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

    @Override
    public Input toEntity(InputDocument inputDocument) {
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

    @Override
    public List<InputDocument> toDocuments(List<Input> inputs) {
        if ( inputs == null ) {
            return null;
        }

        List<InputDocument> list = new ArrayList<InputDocument>( inputs.size() );
        for ( Input input : inputs ) {
            list.add( toDocument( input ) );
        }

        return list;
    }

    @Override
    public List<Input> toEntities(List<InputDocument> inputDocuments) {
        if ( inputDocuments == null ) {
            return null;
        }

        List<Input> list = new ArrayList<Input>( inputDocuments.size() );
        for ( InputDocument inputDocument : inputDocuments ) {
            list.add( toEntity( inputDocument ) );
        }

        return list;
    }
}
