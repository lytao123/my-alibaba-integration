package com.study.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author ouyang
 * @version 1.0
 * @date 2020/6/6 16:08
 **/
@Component
@FeignClient(name = "cloud-alibaba-payment")
public interface PaymentService {

    @GetMapping("/payment/getPaymentInfo")
    String getPaymentInfo();
}
