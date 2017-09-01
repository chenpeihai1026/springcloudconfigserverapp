package com.mk.springcloud.turbine.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableHystrixDashboard
@EnableTurbine
public class SpringcloudTurbineApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudTurbineApplication.class, args);
	}
}
