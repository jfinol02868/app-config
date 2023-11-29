package com.solutionesone.app.infrastructure.mapper;

import com.solutionesone.app.domain.entity.Input;
import com.solutionesone.app.infrastructure.document.InputDocument;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-29T23:49:45+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.8.1 (Private Build)"
)
public class InputMapperImpl implements InputMapper {

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
}
