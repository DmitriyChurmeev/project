package com.custom.project.controllers;

import lombok.Data;

import java.util.Map;

@Data
public class TestRequest {

    private Long id;

    private Map<String, Object> params;
}
