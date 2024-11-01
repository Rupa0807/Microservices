package com.learning.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor@NoArgsConstructor
@Data @ToString
    public  class CountryNameDTO {
        private String common;
        private String official;

    @Override
    public String toString() {
        return "CountryNameDTO{" +
                "common='" + common + '\'' +
                ", official='" + official + '\'' +
                '}';
    }

    public String getCommon() {
        return common;
    }

    public void setCommon(String common) {
        this.common = common;
    }

    public String getOfficial() {
        return official;
    }

    public void setOfficial(String official) {
        this.official = official;
    }
}

