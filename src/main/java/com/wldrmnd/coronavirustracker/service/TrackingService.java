package com.wldrmnd.coronavirustracker.service;

import com.wldrmnd.coronavirustracker.DTO.CountryStatisticsDTO;
import com.wldrmnd.coronavirustracker.config.RestApiConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public interface TrackingService {

    Logger logger = LoggerFactory.getLogger(RestApiConfig.class);

    List<CountryStatisticsDTO> getCountriesStats();

}
