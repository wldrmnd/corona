package com.wldrmnd.coronavirustracker.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CountryStatisticsDTO {

    @JsonProperty("Country")
    private String name;
    @JsonProperty("CountryCode")
    private String code;
    @JsonProperty("NewConfirmed")
    private String wewConfirmed;
    @JsonProperty("TotalConfirmed")
    private String totalConfirmed;
    @JsonProperty("NewDeaths")
    private String newDeaths;
    @JsonProperty("TotalDeaths")
    private String totalDeaths;
    @JsonProperty("NewRecovered")
    private String newRecovered;
    @JsonProperty("TotalRecovered")
    private String totalRecovered;
    @JsonProperty("Date")
    private String date;
}
