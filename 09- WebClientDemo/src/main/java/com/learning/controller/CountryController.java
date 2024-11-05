package com.learning.controller;

import com.learning.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.learning.dto.CountryDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/api/countries")
public class CountryController {
    private final CountryService countryService;

    @Autowired
    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }


    @GetMapping
    public Flux<CountryDTO> getAllCountries() {
        return countryService.getAllCountries();
    }

    @GetMapping("/{countryName}")
    public Mono<CountryDTO> getByCountryName(@PathVariable("countryName") String countryName) {

        return countryService.getByCountryName(countryName);

    }

    @PostMapping()
    public ResponseEntity<CountryDTO> addCountry(@RequestBody CountryDTO countryDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(countryDTO);
    }

}
