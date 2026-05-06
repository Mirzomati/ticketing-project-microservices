package com.cydeo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient //so it can register itself with eureka
public class GatewayServerApplication {

    public static void main(String[] args) {

        SpringApplication.run(GatewayServerApplication.class,args);


    }
}
