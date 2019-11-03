package com.yhs.eurekaclient.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

//eureka, consul, zookeeper의 implements를 모두 포함.
//@EnableEurekaClient는 only works for eureka.
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }

    /*@Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }*/
}
