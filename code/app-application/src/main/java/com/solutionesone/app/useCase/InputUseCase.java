package com.solutionesone.app.useCase;

import com.solutionesone.app.domain.entity.Input;

import java.util.List;

public interface InputUseCase {

    public Input create(Input input);

    public List<Input> getAllInputs();

    public Input getInputById(String id);

    public Input updateInput(String id, Input input);

    public Void deleteInputById(String id);
}
