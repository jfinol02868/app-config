package com.solutionesone.app.infrastructure.repository.impl;

import com.solutionesone.app.domain.entity.Input;
import com.solutionesone.app.domain.entity.repository.InputRepository;
import com.solutionesone.app.infrastructure.document.InputDocument;
import com.solutionesone.app.infrastructure.repository.InputDocumentRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import static com.solutionesone.app.infrastructure.mapper.InputMapper.inputMapper;

@Repository
public class InputRepositoryImpl implements InputRepository {

    private  final InputDocumentRepository inputDocumentRepository;

    public InputRepositoryImpl(InputDocumentRepository inputDocumentRepository) {
        this.inputDocumentRepository = inputDocumentRepository;
    }

    @Override
    public Input save(Input input) {
        return inputMapper.toEntity(inputDocumentRepository.save(inputMapper.toDocument(input)));
    }

    @Override
    public List<Input> getAllInputs() {
        return inputMapper.toEntities(inputDocumentRepository.findAll());
    }

    @Override
    public Input getInputById(String id) {
        Optional<InputDocument> inputDocument = inputDocumentRepository.findById(id);
        if(inputDocument.isEmpty()) {
            throw new com.solutionesone.app.domain.exception.EntityNotFoundException("N100", "Registro no encontrado");
        }
        return inputMapper.toEntity(inputDocument.get());
    }

    @Override
    public Input updateInput(Input input) {
        Optional<InputDocument> inputDocument = inputDocumentRepository.findById(input.getId());
        if(inputDocument.isEmpty()) {
            throw new com.solutionesone.app.domain.exception.EntityNotFoundException("N100", "Registro no encontrado");
        }
        return inputMapper.toEntity(inputDocumentRepository.save(inputMapper.toDocument(input)));
    }

    @Override
    public void deleteInputById(String id) {
        Optional<InputDocument> inputDocument = inputDocumentRepository.findById(id);
        if(inputDocument.isEmpty()) {
            throw new com.solutionesone.app.domain.exception.EntityNotFoundException("N100", "Registro no encontrado");
        }
        inputDocumentRepository.deleteById(id);
    }
}
