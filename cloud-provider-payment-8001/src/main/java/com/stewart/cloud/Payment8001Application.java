package com.stewart.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author stewart
 */
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class Payment8001Application {

    public static void main(String[] args) {
        SpringApplication.run(Payment8001Application.class, args);
    }

}
