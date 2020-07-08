package com.custom.project.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class MainController {

    @Value("${project.name}")
    private String projectName;

    @GetMapping("test")
    public String test() {
        return projectName;
    }
}
