package com.javatodev.app.controller;

import com.javatodev.app.model.dto.Country;
import com.javatodev.app.service.CountryService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/countries")
@RequiredArgsConstructor
public class CountryController {

    private final CountryService countryService;

    @GetMapping
    public ResponseEntity<List<Country>> readAllCountries () {
        return ResponseEntity.ok(countryService.findAllCountries());
    }

}
