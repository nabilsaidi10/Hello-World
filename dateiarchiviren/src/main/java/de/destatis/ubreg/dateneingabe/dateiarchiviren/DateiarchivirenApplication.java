package de.destatis.ubreg.dateneingabe.dateiarchiviren;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import de.destatis.ubreg.dateneingabe.dateiarchiviren.presentation.utils.FileStorageProperties;

@SpringBootApplication
@EnableConfigurationProperties({
    FileStorageProperties.class
})
public class DateiarchivirenApplication {

	public static void main(String[] args) {
		SpringApplication.run(DateiarchivirenApplication.class, args);
	}

}
