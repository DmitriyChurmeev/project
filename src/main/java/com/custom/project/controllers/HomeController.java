package com.custom.project.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HomeController {

    @PostMapping
    @RequestMapping(value = "/test/{formId}")
    public String index(@RequestBody TestRequest o, @PathVariable("formId") Object formId) {
        log.error("request from yandex form");
        log.error("!!!!");
        log.error(o.getParams().toString());


        return "index";
    }

}
