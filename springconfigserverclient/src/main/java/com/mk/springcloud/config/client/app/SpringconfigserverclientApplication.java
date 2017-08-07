package com.mk.springcloud.config.client.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringconfigserverclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringconfigserverclientApplication.class, args);
	}
}
