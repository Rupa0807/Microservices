package com.learning.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CountryDTO {
    private CountryNameDTO name;
    private List<String> capital;
    private String region;
    private Map<String, String> languages;
    private Map<String, CurrenciesDTO> currencies;
    private Long population;
    private String flag;


}
