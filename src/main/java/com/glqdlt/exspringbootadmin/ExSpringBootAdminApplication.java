package com.glqdlt.exspringbootadmin;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class ExSpringBootAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExSpringBootAdminApplication.class, args);
	}
}
