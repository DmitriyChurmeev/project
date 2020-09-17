package com.custom.project.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class HomeController {

    @PostMapping
    @RequestMapping(value = "/test/{formId}")
    public String index(@RequestBody TestRequest o, @PathVariable("formId") Object formId) {
        log.error("request from yandex form");
        log.error("!!!!");
        String result = (String) o.getParams().get("result");
        log.error(result);
        log.error(o.getParams().get("result").getClass().getSimpleName());
       // log.error(result.get("ФИО").toString());
       // log.error(result.get("Комментарий").toString());

        return "index";
    }
}
