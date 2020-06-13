package com.study.service.impl;

import com.study.dao.AlibabaPaymentDao;
import com.study.entity.UUser;
import com.study.service.AlibabaPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ouyang
 * @version 1.0
 * @date 2020/6/12 21:28
 **/
@Service
public class AlibabaPaymentServiceImpl implements AlibabaPaymentService {

    private final AlibabaPaymentDao alibabaPaymentDao;

    @Autowired
    public AlibabaPaymentServiceImpl(AlibabaPaymentDao alibabaPaymentDao) {
        this.alibabaPaymentDao = alibabaPaymentDao;
    }

    @Override
    public UUser findUserById(Long id) {
        return alibabaPaymentDao.findUserById(id);
    }

    @Override
    public void saveUUser(UUser uUser) {
        alibabaPaymentDao.savePayment(uUser);
    }
}
