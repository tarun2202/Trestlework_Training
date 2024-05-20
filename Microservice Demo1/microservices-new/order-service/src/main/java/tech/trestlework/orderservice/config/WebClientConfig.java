package tech.trestlework.orderservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Bean

    // web client is not a part of "Spring MVC" project but of "Spring Web Flux" project
    public WebClient webClient(){
        return WebClient.builder().build();
    }
}
