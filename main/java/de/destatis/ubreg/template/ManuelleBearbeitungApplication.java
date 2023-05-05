/*
 * Copyright 2022 Statistisches Bundesamt
 */
package de.destatis.ubreg.template;

import java.util.TimeZone;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.lang.Nullable;

/**
 * The ManuelleBearbeitungApplication.
 *
 * @author cosma
 */
@SpringBootApplication
public class ManuelleBearbeitungApplication implements CommandLineRunner {

	/**
	 * Run the application.
	 *
	 * @param args the args.
	 */
	public static void main(@Nullable String[] args) {
		SpringApplication.run(ManuelleBearbeitungApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
	}
}
