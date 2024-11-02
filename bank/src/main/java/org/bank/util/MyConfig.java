package org.bank.util;

import org.bank.controller.CompteRestJaxRSAPI;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public ResourceConfig resourceConfig() {
        ResourceConfig jerseyServet = new ResourceConfig();
        jerseyServet.register(CompteRestJaxRSAPI.class);
        return jerseyServet;
    }
}
