package com.online.taxi.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class OnlineTaxiApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineTaxiApplication.class, args);
    }

}
