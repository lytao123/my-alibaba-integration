package com.study.service;

import com.study.entity.UOrder;

/**
 * @author ouyang
 * @version 1.0
 * @date 2020/6/12 21:23
 **/
public interface AlibabaOrderService {

    /**
     * 查询会员信息
     * @param id 主键
     * @return 会员信息
     */
    UOrder findUOrderById(Long id);

    /**
     * 保存会员信息
     * @param uOrder 会员信息
     */
    void saveUOrder(UOrder uOrder) throws Exception;
}
