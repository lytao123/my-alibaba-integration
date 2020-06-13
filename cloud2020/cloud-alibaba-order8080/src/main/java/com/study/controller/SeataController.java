package com.study.controller;

import com.study.entity.UOrder;
import com.study.service.AlibabaOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author ouyang
 * @version 1.0
 * @date 2020/6/12 21:43
 **/
@RestController
@RequestMapping("/order")
public class SeataController {

    private final AlibabaOrderService alibabaOrderService;

    @Autowired
    public SeataController(AlibabaOrderService alibabaOrderService) {
        this.alibabaOrderService = alibabaOrderService;
    }

    @GetMapping("/findUOrderById/{id}")
    public UOrder findUOrderById(@PathVariable Long id) {
        return alibabaOrderService.findUOrderById(id);
    }

    @PostMapping("/saveUOrder")
    public void saveUOrder(@RequestBody UOrder uOrder) throws Exception {
        alibabaOrderService.saveUOrder(uOrder);
    }
}
