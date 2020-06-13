package com.study.service.impl;

import com.study.dao.AlibabaStorageDao;
import com.study.entity.UGoods;
import com.study.service.AlibabaStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ouyang
 * @version 1.0
 * @date 2020/6/12 21:28
 **/
@Service
public class AlibabaStorageServiceImpl implements AlibabaStorageService {

    private final AlibabaStorageDao alibabaStorageDao;

    @Autowired
    public AlibabaStorageServiceImpl(AlibabaStorageDao alibabaStorageDao) {
        this.alibabaStorageDao = alibabaStorageDao;
    }

    @Override
    public UGoods findGoodsById(Long id) {
        return alibabaStorageDao.findGoodsById(id);
    }

    @Override
    public void saveGoods(UGoods uGoods) {
        alibabaStorageDao.saveGoods(uGoods);
    }
}
