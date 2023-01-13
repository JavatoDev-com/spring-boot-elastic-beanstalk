package com.javatodev.app.service;

import com.javatodev.app.model.dto.Country;
import com.javatodev.app.model.entity.CountryEntity;
import com.javatodev.app.repository.CountryRepository;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class CountryService {

    private final CountryRepository countryRepository;

    public List<Country> findAllCountries() {
        List<CountryEntity> allCountries = countryRepository.findAll();

        List<Country> countries = new ArrayList<>();
        allCountries.forEach(countryEntity -> countries.add(new Country(countryEntity.getName(), countryEntity.getCode())));

        return countries;
    }

}
