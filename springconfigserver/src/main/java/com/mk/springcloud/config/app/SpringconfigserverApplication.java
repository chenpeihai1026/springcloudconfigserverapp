package com.mk.springcloud.config.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;


@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication
public class SpringconfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringconfigserverApplication.class, args);
	}
}
