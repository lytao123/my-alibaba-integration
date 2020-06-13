package com.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.study.service.PaymentService;

/**
 * @author ouyang
 * @version 1.0
 * @date 2020/6/6 16:01
 **/
@RestController
@RequestMapping("/order")
public class PaymentController {

    private final PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping("/getPaymentInfo")
    public String getPaymentInfo() {
        return paymentService.getPaymentInfo();
    }

}
