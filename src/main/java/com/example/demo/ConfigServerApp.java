package com.example.demo;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigServerApp {

	public static void main(String[] args) {
		try {
			File file = new File("https://github.com/loganmca/cloudconfig/blob/master/config/app/coonfigurations/main-client.yml");
			System.out.println(file.getAbsolutePath());
			if(!file.exists())
				System.out.println("True");
			else
				System.out.println("False");
		} catch(Exception e) {
			e.printStackTrace();
		}
		SpringApplication.run(ConfigServerApp.class, args);
	}

}

