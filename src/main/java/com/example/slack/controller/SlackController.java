package com.example.slack.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class SlackController {

    @GetMapping("/")
    public String slack(){
        log.error("Log Error Test");
        log.info("Log Info Test");
        log.debug("Log Debug Test");

        return "test";
    }
}
