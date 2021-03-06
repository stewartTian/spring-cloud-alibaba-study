package com.stewart.stream.rabbit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class StreamMqProvider8011Application {

    public static void main(String[] args) {
        SpringApplication.run(StreamMqProvider8011Application.class, args);
    }

}
