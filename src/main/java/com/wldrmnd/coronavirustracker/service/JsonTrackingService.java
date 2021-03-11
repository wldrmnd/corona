package com.wldrmnd.coronavirustracker.service;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.wldrmnd.coronavirustracker.DTO.CoronavirusDTO;
import com.wldrmnd.coronavirustracker.DTO.CountryStatisticsDTO;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class JsonTrackingService implements TrackingService {

    private JsonMapper objectMapper;
    private TrackingProvider trackingProvider;

    public JsonTrackingService(ObjectMapper objectMapper, TrackingProvider trackingProvider) {
        this.objectMapper = (JsonMapper) objectMapper;
        this.trackingProvider = trackingProvider;
    }

    public List<CountryStatisticsDTO> getCountriesStats() {
        logger.info("Parsing coronavirus provider data");

        String coronavirusData = trackingProvider.getCoronavirusData();

        CoronavirusDTO coronavirusDTO = null;
        try {
            coronavirusDTO = objectMapper.readValue(coronavirusData, CoronavirusDTO.class);
        } catch (JsonProcessingException e) {
            logger.info("Parsing coronavirus provider data has been rejected by null-value");
            e.printStackTrace();
        }

        return coronavirusDTO.getCountryStatisticsDTO();
    }
}
