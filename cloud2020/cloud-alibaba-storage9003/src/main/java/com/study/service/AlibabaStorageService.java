package com.study.service;

import com.study.entity.UGoods;

/**
 * @author ouyang
 * @version 1.0
 * @date 2020/6/12 21:23
 **/
public interface AlibabaStorageService {

    /**
     * 查询会员信息
     * @param id 主键
     * @return 会员信息
     */
    UGoods findGoodsById(Long id);

    /**
     * 保存会员信息
     * @param uGoods 会员信息
     */
    void saveGoods(UGoods uGoods);
}
