package com.jeevs_dolphin.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class}, scanBasePackages = {"com.jeevs_dolphin"})
public class DolphinJeevsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DolphinJeevsApplication.class, args);
	}
}
