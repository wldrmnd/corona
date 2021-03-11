package com.wldrmnd.coronavirustracker.service;

public interface TrackingProvider {

    String DATA_PROVIDER_URL = "https://api.covid19api.com/summary";

    String getCoronavirusData();

}
