package com.study.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author ouyang
 * @version 1.0
 * @date 2020/6/7 16:27
 **/
@Component
@FeignClient(name = "cloud-alibaba-payment")
public interface SentinelService {

    @GetMapping("/sentinel/testA")
    String testA();

    @GetMapping("/sentinel/testB")
    String testB();

    @GetMapping("/sentinel/testC")
    String testC();

    @GetMapping("/sentinel/testD")
    String testD();

    @GetMapping("/sentinel/testE")
    String testE();

    @GetMapping("/sentinel/testF")
    String testF();

    @GetMapping("/sentinel/testG")
    String testG();

    @GetMapping("/sentinel/testH")
    String testH();

    @GetMapping("/sentinel/testI")
    String testI();
}
