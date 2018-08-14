package com.example.configuration;

import javax.sql.DataSource;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class FlywayConfig {

	@Autowired
	private DataSource dataSource;
	
	@Bean
	@Primary
	public Flyway flyway() {
		Flyway flyway = new Flyway();
		flyway.setBaselineOnMigrate(true);
		flyway.setTable("schema_demo");
		flyway.setDataSource(dataSource);
		flyway.setLocations("com.example.migration");
		flyway.migrate();
		return flyway;
	}
	
}
