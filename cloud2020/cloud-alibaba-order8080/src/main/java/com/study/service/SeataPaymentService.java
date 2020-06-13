package com.study.service;

import com.study.entity.UUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author ouyang
 * @version 1.0
 * @date 2020/6/12 22:13
 **/
@Component
@FeignClient(name = "cloud-alibaba-payment")
public interface SeataPaymentService {

    @GetMapping("/payment/findUserById/{id}")
    UUser findUserById(@PathVariable("id") Long id);

    @PostMapping("/payment/saveUUser")
    void saveUUser(@RequestBody UUser uUser);
}
