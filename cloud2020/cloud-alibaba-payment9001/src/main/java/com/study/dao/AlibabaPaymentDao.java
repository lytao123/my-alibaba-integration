package com.study.dao;

import com.study.entity.UUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author ouyang
 * @version 1.0
 * @date 2020/6/12 21:31
 **/
@Mapper
@Component
public interface AlibabaPaymentDao {

    /**
     * 查询会员信息
     * @param id 主键
     * @return 会员信息
     */
    UUser findUserById(Long id);

    /**
     * 保存会员信息
     * @param uUser 会员信息
     */
    void savePayment(UUser uUser);
}
