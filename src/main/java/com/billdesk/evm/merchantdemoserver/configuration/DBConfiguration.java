package com.billdesk.evm.merchantdemoserver.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
@SuppressWarnings("unused")
public class DBConfiguration {
    private String url;
    private String username;


    @Profile("dev")
    @Bean
    public String devDatabaseConnection(){
        System.out.println("DB connected to Dev ");
        return "DB connection for DEV - postgres";
    }

    @Profile("staging")
    @Bean
    public String stagingDatabaseConnection(){
        System.out.println("DB connected to Staging ");
        return "DB connection for Staging - postgres";
    }
}

