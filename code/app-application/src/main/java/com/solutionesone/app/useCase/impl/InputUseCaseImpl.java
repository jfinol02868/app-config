package com.solutionesone.app.useCase.impl;

import com.solutionesone.app.domain.entity.Input;
import com.solutionesone.app.domain.entity.repository.InputRepository;
import com.solutionesone.app.domain.exception.EntityNotFoundException;
import com.solutionesone.app.useCase.InputUseCase;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Slf4j
@Service
public class InputUseCaseImpl implements InputUseCase {

    private final InputRepository inputRepository;

    public InputUseCaseImpl(InputRepository inputRepository) {
        this.inputRepository = inputRepository;
    }

    @Override
    public Input create(Input input) {
       return inputRepository.save(input);
    }

    @Override
    public List<Input> getAllInputs() {
        return inputRepository.getAllInputs();
    }

    @Override
    public Input getInputById(String id) {
        return inputRepository.getInputById(id);
    }

    @Override
    public Input updateInput(String id, Input input) {
        Input updateInput = inputRepository.getInputById(id);
        BeanUtils.copyProperties(input, updateInput);
        return inputRepository.updateInput(updateInput);
    }

    @Override
    public Void deleteInputById(String id) {
        inputRepository.deleteInputById(id);
        return null;
    }
}
