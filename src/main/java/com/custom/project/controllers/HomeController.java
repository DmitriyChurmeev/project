package com.custom.project.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.*;

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
