package com.solutionesone.app.repository.impl;

import com.solutionesone.app.domain.entity.Input;
import com.solutionesone.app.domain.entity.repository.InputRepository;
import org.springframework.stereotype.Repository;

@Repository
public class InputRepositoryImpl implements InputRepository {

    private final InputRepository;

    public InputRepositoryImpl(InputRepository inputRepository) {
        this.inputRepository = inputRepository;
    }

    @Override
    public Input save(Input input) {
        return null;
    }
}
