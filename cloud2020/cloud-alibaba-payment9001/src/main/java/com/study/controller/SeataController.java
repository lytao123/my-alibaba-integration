package com.study.controller;

import com.study.entity.UUser;
import com.study.service.AlibabaPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author ouyang
 * @version 1.0
 * @date 2020/6/12 21:43
 **/
@RestController
@RequestMapping("/payment")
public class SeataController {

    private final AlibabaPaymentService alibabaPaymentService;

    @Autowired
    public SeataController(AlibabaPaymentService alibabaPaymentService) {
        this.alibabaPaymentService = alibabaPaymentService;
    }

    @GetMapping("/findUserById/{id}")
    public UUser findUserById(@PathVariable Long id) {
        return alibabaPaymentService.findUserById(id);
    }

    @PostMapping("/saveUUser")
    public void saveUUser(@RequestBody UUser uUser) {
        alibabaPaymentService.saveUUser(uUser);
    }
}
