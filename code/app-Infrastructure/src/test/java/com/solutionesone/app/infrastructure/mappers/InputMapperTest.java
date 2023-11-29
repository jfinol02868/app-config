package com.solutionesone.app.infrastructure.mappers;

import com.solutionesone.app.domain.entity.Input;
import com.solutionesone.app.infrastructure.document.InputDocument;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.springframework.boot.test.context.SpringBootTest;

import static com.solutionesone.app.infrastructure.mapper.InputMapper.inputMapper;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertAll;

@SpringBootTest
public class InputMapperTest {

    @Test
    @DisplayName("Input to InputDocument.")
    public void shouldMapInputToInputDocumentTest() {
        //Arrange
        Input input = Input.builder()
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
        //Act
        InputDocument inputDocument = inputMapper.toDocument(input);

        //Assert
        assertNotNull(inputDocument);
        assertAll(
                () -> assertEquals("1", inputDocument.getId()),
                () -> assertEquals("text", inputDocument.getType()),
                () -> assertEquals("name", inputDocument.getName()),
                () -> assertEquals("id-name", inputDocument.getInputId()),
                () -> assertEquals("Name", inputDocument.getPlaceHolder()),
                () -> assertEquals("send", inputDocument.getValue()),
                () -> assertEquals("0", inputDocument.getMinLength()),
                () -> assertEquals("100", inputDocument.getMaxLength()),
                () -> assertEquals("A-Za-z]{3}", inputDocument.getPattern()),
                () -> assertEquals("2023-05-01", inputDocument.getMax()),
                () -> assertEquals("199-01-01", inputDocument.getMin()),
                () -> assertEquals("main", inputDocument.getAlt()),
                () -> assertEquals("www.youtube.com", inputDocument.getSrc()),
                () -> assertEquals("_blank", inputDocument.getFormTarget()),
                () -> assertEquals("/action_page.php", inputDocument.getAction()),
                () -> assertEquals("GET", inputDocument.getMethod())
        );
    }

    @Test
    @DisplayName("InputDocument to Input.")
    public void shouldMapDtoToEntityTest() {
        //Arrange
        InputDocument inputDocument = InputDocument.builder()
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
        //Act
        Input input = inputMapper.toEntity(inputDocument);

        //Assert
        assertNotNull(input);
        assertAll(
                () -> assertEquals("1", input.getId()),
                () -> assertEquals("text", input.getType()),
                () -> assertEquals("name", input.getName()),
                () -> assertEquals("id-name", input.getInputId()),
                () -> assertEquals("Name", input.getPlaceHolder()),
                () -> assertEquals("send", input.getValue()),
                () -> assertEquals("0", input.getMinLength()),
                () -> assertEquals("100", input.getMaxLength()),
                () -> assertEquals("A-Za-z]{3}", input.getPattern()),
                () -> assertEquals("2023-05-01", input.getMax()),
                () -> assertEquals("199-01-01", input.getMin()),
                () -> assertEquals("main", input.getAlt()),
                () -> assertEquals("www.youtube.com", input.getSrc()),
                () -> assertEquals("_blank", input.getFormTarget()),
                () -> assertEquals("/action_page.php", input.getAction()),
                () -> assertEquals("GET", input.getMethod())
        );
    }
}
