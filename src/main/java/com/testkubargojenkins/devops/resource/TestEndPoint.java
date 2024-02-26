package com.testkubargojenkins.devops.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestEndPoint {

    @GetMapping
    public String test() {
        return "Test endpoint is working!";
    }
}
