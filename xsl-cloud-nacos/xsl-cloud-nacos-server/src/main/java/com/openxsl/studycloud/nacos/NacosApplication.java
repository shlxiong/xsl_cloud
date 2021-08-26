package com.openxsl.studycloud.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.openxsl.studycloud")
//@EnableDiscoveryClient
@SpringBootApplication
public class NacosApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(NacosApplication.class, args);
	}

}
