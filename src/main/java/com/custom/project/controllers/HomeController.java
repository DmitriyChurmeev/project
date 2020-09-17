package com.custom.project.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Slf4j
@RestController
public class HomeController {

    @PostMapping
    @RequestMapping(value = "/test/{formId}")
    public String index(@RequestBody Object o, @PathVariable("formId") RequestEntity formId) {
        log.error("request from yandex form");
        log.error(formId.getBody().toString());
        Map map = new ObjectMapper().convertValue(o, Map.class);
        log.error(map.toString());
        log.error(o.toString());
        return "index";
    }
}
