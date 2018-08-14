package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.metrics.export.prometheus.EnablePrometheusMetrics;
import org.springframework.metrics.export.prometheus.EnablePrometheusScraping;

@SpringBootApplication
@EnablePrometheusMetrics
@EnablePrometheusScraping
@EnableAutoConfiguration
public class BasePrometheusApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasePrometheusApplication.class, args);
	}
}
