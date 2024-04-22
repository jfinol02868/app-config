package com.solutionesone.app.input.mappers;

import com.solutionesone.app.domain.entity.GetFormConfig;
import com.solutionesone.app.domain.entity.Input;
import com.solutionesone.app.service.dto.GetFormConfigDTO;
import com.solutionesone.app.service.dto.InputDTO;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.solutionesone.app.mapper.GetFormConfigDTOMapper.getFormConfigDTOMapper;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertAll;

@SpringBootTest
public class GetFormConfigDTOMapperTest {

    @Test
    @DisplayName(value = "Map Get Form Config DTO To Entity.")
    public void mapGetFormConfigDTOToEntity() {

        List<GetFormConfigDTO> getFormConfigDTOs = List.of(GetFormConfigDTO.builder()
                .id("1")
                .configName("login")
                .inputs(List.of(
                        InputDTO.builder()
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
                                .build()
                ))
                .build());

        List<GetFormConfig> getFormConfigs = getFormConfigDTOMapper.toEntities(getFormConfigDTOs);

        assertFalse(getFormConfigs.isEmpty());
        getFormConfigs.forEach( x ->
                assertAll(
                            () -> assertEquals("1", x.getId()),
                            () ->assertEquals("login", x.getConfigName()),
                            () -> assertEquals(1, x.getInputs().size()),
                            () -> x.getInputs().forEach( y ->
                                        assertAll(
                                                () -> assertEquals("1", y.getId()),
                                                () -> assertEquals("name", y.getName()),
                                                () -> assertEquals("text", y.getType()),
                                                () -> assertEquals("id-name", y.getInputId()),
                                                () -> assertEquals("Name", y.getPlaceHolder()),
                                                () -> assertEquals("send", y.getValue()),
                                                () -> assertEquals("0", y.getMinLength()),
                                                () -> assertEquals("100", y.getMaxLength()),
                                                () -> assertEquals("A-Za-z]{3}", y.getPattern()),
                                                () -> assertEquals("2023-05-01", y.getMax()),
                                                () -> assertEquals("199-01-01", y.getMin()),
                                                () -> assertEquals("main", y.getAlt()),
                                                () -> assertEquals("www.youtube.com", y.getSrc()),
                                                () -> assertEquals("_blank", y.getFormTarget()),
                                                () -> assertEquals("/action_page.php", y.getAction()),
                                                () -> assertEquals("GET", y.getMethod())
                                        )
                                )
                        )
                );
    }

    @Test
    @DisplayName(value = "Map Get Form Config Entity To DTO.")
    public void mapGetFormConfigEntityToDTO() {

        List<GetFormConfig> getFormConfigs = List.of(GetFormConfig.builder()
                .id("1")
                .configName("login")
                .inputs(List.of(
                        Input.builder()
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
                                .build()
                ))
                .build());

        List<GetFormConfigDTO> getFormConfigDTOs = getFormConfigDTOMapper.toDTOs(getFormConfigs);

        assertFalse(getFormConfigDTOs.isEmpty());
        getFormConfigDTOs.forEach( x ->
                assertAll(
                        () -> assertEquals("1", x.getId()),
                        () ->assertEquals("login", x.getConfigName()),
                        () -> assertEquals(1, x.getInputs().size()),
                        () -> x.getInputs().forEach( y ->
                                assertAll(
                                        () -> assertEquals("1", y.getId()),
                                        () -> assertEquals("name", y.getName()),
                                        () -> assertEquals("text", y.getType()),
                                        () -> assertEquals("id-name", y.getInputId()),
                                        () -> assertEquals("Name", y.getPlaceHolder()),
                                        () -> assertEquals("send", y.getValue()),
                                        () -> assertEquals("0", y.getMinLength()),
                                        () -> assertEquals("100", y.getMaxLength()),
                                        () -> assertEquals("A-Za-z]{3}", y.getPattern()),
                                        () -> assertEquals("2023-05-01", y.getMax()),
                                        () -> assertEquals("199-01-01", y.getMin()),
                                        () -> assertEquals("main", y.getAlt()),
                                        () -> assertEquals("www.youtube.com", y.getSrc()),
                                        () -> assertEquals("_blank", y.getFormTarget()),
                                        () -> assertEquals("/action_page.php", y.getAction()),
                                        () -> assertEquals("GET", y.getMethod())
                                )
                        )
                )
        );
    }
}
