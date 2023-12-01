package com.jconf.workshop.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "country")
@Getter
@Setter
public class UserCountryConfigClass {

    private String language;
    private String timeZone;
}