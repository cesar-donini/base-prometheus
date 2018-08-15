package com.example.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.metrics.boot.MeterBinderRegistration;

@Configuration
public class PrometheusConfig {

	@Bean
	public MeterBinderRegistration getMeterBinderRegistration() {
		return new MeterBinderRegistration();
	}
	
}
