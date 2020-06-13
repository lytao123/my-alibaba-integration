package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ouyang
 * @version 1.0
 * @date 2020/6/6 15:57
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class CloudAlibabaPayment9002 {

    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaPayment9002.class, args);
    }
}
