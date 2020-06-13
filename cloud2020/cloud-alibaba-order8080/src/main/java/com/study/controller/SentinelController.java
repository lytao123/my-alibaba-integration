package com.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.study.service.SentinelService;

/**
 * @author ouyang
 * @version 1.0
 * @date 2020/6/7 16:27
 **/
@RestController
@RequestMapping("/order")
public class SentinelController {

    private final SentinelService sentinelService;

    @Autowired
    public SentinelController(SentinelService sentinelService) {
        this.sentinelService = sentinelService;
    }


    @GetMapping("/testA")
    public String testA() {
        return sentinelService.testA();
    }

    @GetMapping("/testB")
    public String testB() {
        return sentinelService.testB();
    }

    @GetMapping("/testC")
    public String testC() {
        return sentinelService.testC();
    }

    @GetMapping("/testD")
    public String testD() {
        return sentinelService.testD();
    }

    @GetMapping("/testE")
    public String testE() {
        return sentinelService.testE();
    }

    @GetMapping("/testF")
    public String testF() {
        return sentinelService.testF();
    }

    @GetMapping("/testG")
    public String testG() {
        return sentinelService.testG();
    }

    @GetMapping("/testH")
    public String testH() {
        return sentinelService.testH();
    }

    @GetMapping("/testI")
    public String testI() {
        return sentinelService.testI();
    }
}
