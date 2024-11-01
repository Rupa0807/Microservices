package com.learning.service;

import com.learning.dto.CountryNameDTO;
import com.learning.dto.CountryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Service
public class CountryService {

    private final RestTemplate restTemplate;
    String url = "https://restcountries.com/v3.1/all";

    @Autowired
    public CountryService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<CountryDTO> getAllCountries() {
        CountryDTO[] countries = restTemplate.getForObject(url, CountryDTO[].class);
        if (countries != null) {
            Arrays.stream(countries).forEach(System.out::println);
        }
        return Arrays.asList(countries);
    }

    public Optional<CountryDTO> getbyCountryName(String countryName) {
        List<CountryDTO> getCountry = getAllCountries();
        Optional<CountryDTO> myCountry = getCountry.stream().filter(c -> c.getName().getCommon().equalsIgnoreCase(countryName)).findFirst();
        return myCountry;
    }
}