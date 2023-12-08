package com.sii.aspirantes.aspirantes.Config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Arrays;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter{

    private static final String MAPPING = "/**";
    //    private String [] ORIGINS = {"http://localhost:3000"}; // Direcciones donde se hará uso de la API
    private static final String[] ORIGINS = {"*"};
    private static final String [] METHODS= {"POST", "GET", "PATCH", "PUT", "DELETE", "POTIONS", "HEAD"};
//    private static final String [] HEADS;


    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping(MAPPING)
                .allowedOrigins(ORIGINS)
                .allowedMethods(METHODS)
                .allowedHeaders("*")
                .maxAge(3600)
                .allowCredentials(false);
    }

}