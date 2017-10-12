package com.mhy.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class OrderCenterApplication {

  public static void main(String[] args) {
    SpringApplication.run(OrderCenterApplication.class, args);
  }
}
