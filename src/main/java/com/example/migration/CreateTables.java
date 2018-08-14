package com.example.migration;

import org.flywaydb.core.api.MigrationVersion;
import org.flywaydb.core.api.migration.MigrationInfoProvider;
import org.flywaydb.core.api.migration.spring.SpringJdbcMigration;
import org.springframework.jdbc.core.JdbcTemplate;

public class CreateTables implements SpringJdbcMigration, MigrationInfoProvider {

	@Override
	public void migrate(JdbcTemplate jdbcTemplate) throws Exception {
		StringBuilder sql = new StringBuilder();
		sql.append("CREATE TABLE pessoa (");
		sql.append("	id uuid PRIMARY KEY,");
		sql.append("	nome VARCHAR(100) NOT NULL,");
		sql.append("	idade INT NOT NULL)");
		
		jdbcTemplate.execute(sql.toString());
	}

	@Override
	public MigrationVersion getVersion() {
		return MigrationVersion.fromVersion("0002");
	}

	@Override
	public String getDescription() {
		return "Criação das tabelas principais do sistema";
	}

	@Override
	public boolean isUndo() {
		return false;
	}
	
}
