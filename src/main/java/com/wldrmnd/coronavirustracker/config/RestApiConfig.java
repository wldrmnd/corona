package com.wldrmnd.coronavirustracker.config;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestApiConfig {

    private final static Logger logger = LoggerFactory.getLogger(RestApiConfig.class);

    @Bean
    public RestTemplate getTrackingTemplate() {
        logger.info("RestTemplate Bean definition");

        RestTemplateBuilder builder = new RestTemplateBuilder();

        return builder.build();
    }

    @Bean
    public ObjectMapper getObjectMapper() {
        logger.info("ObjectMapper Bean definition");

        ObjectMapper mapper = new JsonMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        return mapper;
    }
}
