package com.rjgonzalez.eureka.arquitecture.challenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaInsurancesArquitectureChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaInsurancesArquitectureChallengeApplication.class, args);
	}

}
