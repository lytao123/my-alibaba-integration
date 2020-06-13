package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ouyang
 * @version 1.0
 * @date 2020/6/6 15:57
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class CloudAlibabaOrder8080 {

    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaOrder8080.class, args);
    }
}
