package com.backend.mundoAnimal.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class CustomWebSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {

    @SuppressWarnings("removal")
    protected void configure(HttpSecurity http) throws Exception {
        http.headers(headers -> headers
                .httpStrictTransportSecurity()
                .disable());
    }
}
