package com.study.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ouyang
 * @version 1.0
 * @date 2020/6/6 16:01
 **/
@RefreshScope
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Value("${server.port}")
    private String port;

    @Value("${message.info}")
    private String message;

    @GetMapping("/getPaymentInfo")
    public String getPaymentInfo() {
        return "message:" + message + ", nacos payment test， port：" + port;
    }

}
