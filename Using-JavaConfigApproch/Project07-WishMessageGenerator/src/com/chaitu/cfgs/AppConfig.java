package com.chaitu.cfgs;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.chaitu.sbeans")
public class AppConfig {

	@Bean("ltime")
	public LocalTime timeNow() {
		return LocalTime.now();
	}

}
