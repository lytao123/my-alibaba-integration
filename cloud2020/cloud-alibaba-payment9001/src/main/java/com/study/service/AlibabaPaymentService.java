package com.study.service;

import com.study.entity.UUser;

/**
 * @author ouyang
 * @version 1.0
 * @date 2020/6/12 21:23
 **/
public interface AlibabaPaymentService {

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
    void saveUUser(UUser uUser);
}
