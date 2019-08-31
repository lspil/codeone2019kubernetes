package com.endava.saconf2019e2.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
@RestController
public class StatefulService {

    private String name;

    @PostMapping("/name/{name}")
    public void provideName(@PathVariable String name) {
        this.name = name;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello, " + this.name;
    }
}
