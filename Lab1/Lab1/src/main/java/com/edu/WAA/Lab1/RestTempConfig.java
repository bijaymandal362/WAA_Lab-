package com.edu.WAA.Lab1;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTempConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
