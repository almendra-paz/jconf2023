package com.jconf.workshop.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "country")
public record UserCountryConfig (String language,
                                 String timeZone) {

}
