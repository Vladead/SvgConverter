package com.degree.svg_converter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SvgConverterApplication {

	public static void main(String[] args) {
		SpringApplication.run(SvgConverterApplication.class, args);
	}

}
