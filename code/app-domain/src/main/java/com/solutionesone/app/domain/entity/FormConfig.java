package com.solutionesone.app.domain.entity;

import lombok.Builder;

import java.util.List;

@Builder
public record FormConfig(
        String id,
        String configName,
        List<String> inputIds
) {}
