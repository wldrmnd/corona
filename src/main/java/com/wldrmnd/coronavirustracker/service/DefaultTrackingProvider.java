package com.wldrmnd.coronavirustracker.service;


import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DefaultTrackingProvider {

    private static final String DATA_PROVIDER_URL = "https://api.covid19api.com/summary";

    private RestTemplate restTemplate;

    public DefaultTrackingProvider(RestTemplate template) {
        restTemplate = template;
    }

    public String getCoronavirusData() {
        return restTemplate.getForObject(DATA_PROVIDER_URL, String.class);
    }
}
