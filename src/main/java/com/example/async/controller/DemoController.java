package com.example.async.controller;

import com.example.async.service.DemoService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class DemoController {

    private final DemoService service;

    @GetMapping("/")
    public String get() {
        return "get";
    }
}
