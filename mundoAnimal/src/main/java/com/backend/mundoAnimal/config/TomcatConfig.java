package com.backend.mundoAnimal.config;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TomcatConfig {

    @Bean
    public ServletWebServerFactory servletContainer() {
        TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory();
        factory.addConnectorCustomizers(connector -> {
            connector.setScheme("https");
            connector.setSecure(true);
            connector.setPort(8443);
            connector.setProperty("keyAlias", "tomcat");
            connector.setProperty("keystoreFile", "classpath:petshopvalu.store.p12");
            connector.setProperty("keystorePass", "pamepame123");
            connector.setProperty("keystoreType", "PKCS12");
            connector.setProperty("clientAuth", "false");
            connector.setProperty("sslProtocol", "TLS");
        });
        return factory;
    }
}