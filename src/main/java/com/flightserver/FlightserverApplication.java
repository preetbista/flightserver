package com.flightserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FlightserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightserverApplication.class, args);
	}

}
