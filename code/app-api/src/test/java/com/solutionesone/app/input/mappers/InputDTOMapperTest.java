package com.solutionesone.app.input.mappers;

import com.solutionesone.app.domain.entity.Input;
import com.solutionesone.app.mapper.InputDTOMapper;
import com.solutionesone.app.service.dto.InputDTO;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertAll;

@SpringBootTest
public class InputDTOMapperTest {

    @Test
    @DisplayName("Input to InputDTO.")
    public void mapInputToDtoTest() {
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
        InputDTO inputDTO = InputDTOMapper.inputDTOMapper.toDTO(input);

        //Assert
        assertNotNull(inputDTO);
        assertAll(
                () -> assertEquals("1", inputDTO.getId()),
                () -> assertEquals("text", inputDTO.getType()),
                () -> assertEquals("name", inputDTO.getName()),
                () -> assertEquals("id-name", inputDTO.getInputId()),
                () -> assertEquals("Name", inputDTO.getPlaceHolder()),
                () -> assertEquals("send", inputDTO.getValue()),
                () -> assertEquals("0", inputDTO.getMinLength()),
                () -> assertEquals("100", inputDTO.getMaxLength()),
                () -> assertEquals("A-Za-z]{3}", inputDTO.getPattern()),
                () -> assertEquals("2023-05-01", inputDTO.getMax()),
                () -> assertEquals("199-01-01", inputDTO.getMin()),
                () -> assertEquals("main", inputDTO.getAlt()),
                () -> assertEquals("www.youtube.com", inputDTO.getSrc()),
                () -> assertEquals("_blank", inputDTO.getFormTarget()),
                () -> assertEquals("/action_page.php", inputDTO.getAction()),
                () -> assertEquals("GET", inputDTO.getMethod())
        );
    }

    @Test
    @DisplayName("InputDTO to Input.")
    public void mapDtoToEntityTest() {
        //Arrange
        InputDTO inputDTO = InputDTO.builder()
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
        Input input = InputDTOMapper.inputDTOMapper.toEntity(inputDTO);

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
