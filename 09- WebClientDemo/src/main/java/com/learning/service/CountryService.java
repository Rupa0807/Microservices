package com.learning.service;

import com.learning.dto.CountryNameDTO;
import com.learning.dto.CountryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CountryService {

    private final WebClient webClient;

    @Autowired
    public CountryService(WebClient webClient) {
        this.webClient = webClient;
    }

    public Flux<CountryDTO> getAllCountries() {
        return webClient.get().uri("/all").retrieve().bodyToFlux(CountryDTO.class);
        // Flux represents a stream of CountryDTO objects
    }

    public Mono<CountryDTO> getByCountryName(String name) {
        return webClient.get().uri("/name/{name}", name).retrieve().bodyToFlux(CountryDTO.class).next();
        // Using .next() to get the first match from Flux as Mono
    }
}