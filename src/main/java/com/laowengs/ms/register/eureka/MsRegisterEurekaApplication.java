package com.laowengs.ms.register.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MsRegisterEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsRegisterEurekaApplication.class, args);
	}

}
