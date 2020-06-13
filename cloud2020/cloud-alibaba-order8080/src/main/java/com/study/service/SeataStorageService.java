package com.study.service;

import com.study.entity.UGoods;
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
@FeignClient(name = "cloud-alibaba-storage")
public interface SeataStorageService {

    @GetMapping("/storage/findGoodsById/{id}")
    UGoods findGoodsById(@PathVariable("id") Long id);

    @PostMapping("/storage/saveGoods")
    void saveGoods(@RequestBody UGoods uGoods);
}
