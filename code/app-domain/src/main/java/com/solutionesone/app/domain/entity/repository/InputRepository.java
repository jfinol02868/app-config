package com.solutionesone.app.domain.entity.repository;

import com.solutionesone.app.domain.entity.Input;

import java.util.List;

public interface InputRepository {

    public Input save(Input input);

    public List<Input> getAllInputs();

    public Input getInputById(String id);

    public Input updateInput(Input input);

    public void deleteInputById(String id);
}
