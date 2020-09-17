package com.custom.project.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Slf4j
@Controller
public class HomeController {

    @PostMapping
    @RequestMapping(value = "/test/{formId}")
    public String index(@RequestBody Object o, @PathVariable("formId") long formId) {
        log.error("request from yandex form");
        log.error(o.toString());
        Map map = new ObjectMapper().convertValue(o, Map.class);
        log.error(map.toString());
        return "index";
    }
}
