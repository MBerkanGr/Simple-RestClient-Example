package com.mehmetberkan.Simple.RestTemplate;

import com.mehmetberkan.Simple.RestTemplate.config.ApplicationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ApplicationProperties.class)
public class SimpleRestTemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleRestTemplateApplication.class, args);
    }

}
