package com.wldrmnd.coronavirustracker.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GlobalStatisticsDTO {

    @JsonProperty("NewConfirmed")
    private Long newConfirmed;
    @JsonProperty("TotalConfirmed")
    private Long totalConfirmed;
    @JsonProperty("NewDeaths")
    private Long newDeaths;
    @JsonProperty("TotalDeaths")
    private Long totalDeaths;
    @JsonProperty("NewRecovered")
    private Long newRecovered;
    @JsonProperty("TotalRecovered")
    private Long totalRecovered;
    @JsonProperty("Date")
    private String date;

}
