package com.backend.mundoAnimal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class MundoAnimalApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(MundoAnimalApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MundoAnimalApplication.class, args);
		LOGGER.info("Aplicación en ejecución...");
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
