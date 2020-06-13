package com.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ouyang
 * @version 1.0
 * @date 2020/6/7 16:27
 **/
@RestController
@RequestMapping("/sentinel")
public class SentinelController {

    @GetMapping("/testA")
    public String testA() {
        return "testA";
    }

    @GetMapping("/testB")
    public String testB() {
        return "testB";
    }

    @GetMapping("/testC")
    public String testC() {
        return "testC";
    }

    @GetMapping("/testD")
    public String testD() {
        return "testD";
    }

    @GetMapping("/testE")
    public String testE() {
        return "testE";
    }

    @GetMapping("/testF")
    public String testF() {
        return "testF";
    }

    @GetMapping("/testG")
    public String testG() {
        return "testG";
    }

    @GetMapping("/testH")
    public String testH() {
        return "testH";
    }

    @GetMapping("/testI")
    public String testI() {
        return "testI";
    }
}
