package com.schwedlermobile.PartyPlanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class PartyPlannerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PartyPlannerApplication.class, args);
	}

}
