package com.team.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
@EnableConfigServer
@SpringBootApplication
@EnableDiscoveryClient
public class CurrencyConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConfigServerApplication.class, args);
		System.out.println("app started");
	}

}
