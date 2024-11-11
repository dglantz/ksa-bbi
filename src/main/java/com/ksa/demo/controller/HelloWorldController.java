package com.ksa.demo.controller;

import java.time.Instant;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value = "/")
@Slf4j
public class HelloWorldController {

    @GetMapping("/")
    public String hello() {
        return "Hello it is currently "+Instant.now();
    }

}
