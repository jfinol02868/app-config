package com.solutionesone.app.infrastructure.repository.impl;

import com.solutionesone.app.domain.entity.Input;
import com.solutionesone.app.domain.entity.repository.InputRepository;
import com.solutionesone.app.infrastructure.document.InputDocument;
import org.springframework.stereotype.Repository;

import static com.solutionesone.app.infrastructure.mapper.InputMapper.inputMapper;

@Repository
public class InputRepositoryImpl implements InputRepository {

    @Override
    public Input save(Input input) {
        return inputMapper.toEntity(InputDocument.builder()
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
                .build());
    }
}
