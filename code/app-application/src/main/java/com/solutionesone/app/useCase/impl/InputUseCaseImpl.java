package com.solutionesone.app.useCase.impl;

import com.solutionesone.app.domain.entity.Input;
import com.solutionesone.app.domain.entity.repository.InputRepository;
import com.solutionesone.app.useCase.InputUseCase;
import org.springframework.stereotype.Service;

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
}
