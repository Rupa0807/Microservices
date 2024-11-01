package com.learning.controller;

import com.learning.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.learning.dto.CountryDTO;

import java.util.List;


@RestController
@RequestMapping("/api/countries")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping
    public ResponseEntity<List<CountryDTO>> getAllCountries() {
        return ResponseEntity.ok().body(countryService.getAllCountries());
    }

    @PostMapping()
    public ResponseEntity<CountryDTO> addCountry(@RequestBody CountryDTO countryDTO) {
        System.out.println("Received country data: " + countryDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(countryDTO);
    }

    @GetMapping("/{countryName}")
    public ResponseEntity<CountryDTO> getCountryByName(@PathVariable("countryName") String countryName) {
        ;
        return ResponseEntity.ok(countryService.getbyCountryName(countryName).
                orElseThrow(() -> new NullPointerException("Country Not Available.Check your spelling")));

    }
}
