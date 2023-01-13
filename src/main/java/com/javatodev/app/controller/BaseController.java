package com.javatodev.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class BaseController {

    @GetMapping
    public ResponseEntity homePath() {
        return ResponseEntity.ok().build();
    }
}
