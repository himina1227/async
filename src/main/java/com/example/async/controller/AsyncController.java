package com.example.async.controller;

import com.example.async.service.AsyncService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AsyncController {

    private final AsyncService service;

    @GetMapping("/1")
    public String asyncCall_1() {
        service.asyncCall_1();
        return "success";
    }

    @GetMapping("/2")
    public String asyncCall_2() {
        service.asyncCall_2();
        return "success";
    }

    @GetMapping("/3")
    public String asyncCall_3() {
        service.asyncCall_3();
        return "success";
    }
}
