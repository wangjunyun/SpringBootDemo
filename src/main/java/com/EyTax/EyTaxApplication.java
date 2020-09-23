package com.EyTax;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
public class EyTaxApplication extends SpringBootServletInitializer {

	public static Logger logger = LoggerFactory.getLogger(EyTaxApplication.class);

	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(EyTaxApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(EyTaxApplication.class, args);
	}
}
