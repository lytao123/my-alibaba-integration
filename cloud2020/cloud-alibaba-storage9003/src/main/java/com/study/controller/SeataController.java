package com.study.controller;

import com.study.entity.UGoods;
import com.study.service.AlibabaStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author ouyang
 * @version 1.0
 * @date 2020/6/12 21:43
 **/
@RestController
@RequestMapping("/storage")
public class SeataController {

    private final AlibabaStorageService alibabaStorageService;

    @Autowired
    public SeataController(AlibabaStorageService alibabaStorageService) {
        this.alibabaStorageService = alibabaStorageService;
    }

    @GetMapping("/findGoodsById/{id}")
    public UGoods findGoodsById(@PathVariable Long id) {
        return alibabaStorageService.findGoodsById(id);
    }

    @PostMapping("/saveGoods")
    public void saveGoods(@RequestBody UGoods uGoods) {
        alibabaStorageService.saveGoods(uGoods);
    }
}
