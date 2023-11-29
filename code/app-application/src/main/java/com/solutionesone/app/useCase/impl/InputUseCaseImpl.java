package com.solutionesone.app.useCase.impl;

import com.solutionesone.app.entity.Input;
import com.solutionesone.app.useCase.InputUseCase;
import org.springframework.stereotype.Service;

@Service
public class InputUseCaseImpl implements InputUseCase {
    @Override
    public Input create(Input input) {
       return Input.builder()
               .id("1")
               .type("text")
               .name("name")
               .inputId("id-name")
               .placeHolder("Name")
               .value("send")
               .minLength("0")
               .maxLength("100")
               .pattern("A-Za-z]{3}")
               .max("2023-05-01")
               .min("199-01-01")
               .alt("main")
               .src("www.youtube.com")
               .formTarget("_blank")
               .action("/action_page.php")
               .method("GET")
               .build();
    }
}
