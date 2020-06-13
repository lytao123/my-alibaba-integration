package com.study.dao;

import com.study.entity.UOrder;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author ouyang
 * @version 1.0
 * @date 2020/6/12 21:31
 **/
@Mapper
@Component
public interface AlibabaOrderDao {

    /**
     * 查询订单信息
     * @param id 主键
     * @return 订单信息
     */
    UOrder findOrderById(Long id);

    /**
     * 保存订单信息
     * @param uOrder 订单信息
     */
    void saveOrder(UOrder uOrder);
}
