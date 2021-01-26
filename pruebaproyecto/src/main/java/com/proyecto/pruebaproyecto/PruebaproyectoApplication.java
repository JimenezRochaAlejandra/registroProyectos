package com.proyecto.pruebaproyecto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class PruebaproyectoApplication extends SpringBootServletInitializer{
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(PruebaproyectoApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(PruebaproyectoApplication.class, args);
	}

}
