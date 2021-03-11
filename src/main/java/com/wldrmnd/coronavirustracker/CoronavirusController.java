package com.wldrmnd.coronavirustracker;


import com.wldrmnd.coronavirustracker.DTO.CountryStatisticsDTO;
import com.wldrmnd.coronavirustracker.service.DefaultTrackingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CoronavirusController {

    final private DefaultTrackingService service;

    public CoronavirusController(DefaultTrackingService service) {
        this.service = service;
    }

    @GetMapping("/stats")
    public List<CountryStatisticsDTO> getCountriesStats() {
        return service.getCountriesStats();
    }
}
