package com.wldrmnd.coronavirustracker;


import com.wldrmnd.coronavirustracker.DTO.CountryStatisticsDTO;
import com.wldrmnd.coronavirustracker.service.JsonTrackingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CoronavirusController {

    final private JsonTrackingService service;

    public CoronavirusController(JsonTrackingService service) {
        this.service = service;
    }

    @GetMapping("/stats")
    public List<CountryStatisticsDTO> getCountriesStats() {
        return service.getCountriesStats();
    }
}
