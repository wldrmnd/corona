package com.wldrmnd.coronavirustracker.service;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.wldrmnd.coronavirustracker.DTO.CoronavirusDTO;
import com.wldrmnd.coronavirustracker.DTO.CountryStatisticsDTO;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DefaultTrackingService {

    private JsonMapper objectMapper;
    private DefaultTrackingProvider trackingProvider;

    public DefaultTrackingService(ObjectMapper objectMapper, DefaultTrackingProvider trackingProvider) {
        this.objectMapper = (JsonMapper) objectMapper;
        this.trackingProvider = trackingProvider;
    }

    public List<CountryStatisticsDTO> getCountriesStats() {
        String coronavirusData = trackingProvider.getCoronavirusData();

        CoronavirusDTO coronavirusDTO = null;
        try {
            coronavirusDTO = objectMapper.readValue(coronavirusData, CoronavirusDTO.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return coronavirusDTO.getCountryStatisticsDTO();
    }
}
