package com.custom.project.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.Map;

@Slf4j
@RestController
public class HomeController {

    @PostMapping
    @RequestMapping(value = "/test/{formId}")
    public String index(@RequestBody TestRequest o, @PathVariable("formId") Object formId) {
        log.error("request from yandex form");
        log.error("!!!!");
        LinkedHashMap result = (LinkedHashMap) o.getParams().get("result");
        log.error(result.get("ФИО").toString());
        log.error(result.get("Комментарий").toString());

        return "index";
    }
}
