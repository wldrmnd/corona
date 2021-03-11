package com.wldrmnd.coronavirustracker.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class CoronavirusDTO {

    @JsonProperty("Global")
    private GlobalStatisticsDTO globalStatisticsDTO;

    @JsonProperty("Countries")
    private List<CountryStatisticsDTO> countryStatisticsDTO;
}
