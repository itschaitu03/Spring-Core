package com.chaitu.cfgs;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.chaitu.sbeans")
public class AppConfig {

	@Bean("ldate")
	public LocalDate dateNow() {
		return LocalDate.now();
	}

	@Bean("ltime")
	public LocalTime timeNow() {
		return LocalTime.now();
	}

}
