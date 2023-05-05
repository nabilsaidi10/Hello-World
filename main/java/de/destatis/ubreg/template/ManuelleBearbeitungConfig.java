/*
 * Copyright 2022 Statistisches Bundesamt
 */
package de.destatis.ubreg.template;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * The BerichtskreisverwaltungApplication.
 *
 * @author cosma
 */
@Configuration
@ComponentScan(basePackages = { "de.destatis.*", "_PACKAGE_.*" })
@EntityScan({ "de.destatis.*", "_PACKAGE_.*" })
@EnableJpaRepositories(basePackages = { "de.destatis.*", "_PACKAGE_.*" })
public class ManuelleBearbeitungConfig {
	// Nothing to do here
}
