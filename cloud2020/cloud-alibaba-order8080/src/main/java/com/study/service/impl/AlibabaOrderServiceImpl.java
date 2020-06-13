package com.study.service.impl;

import com.study.dao.AlibabaOrderDao;
import com.study.entity.UGoods;
import com.study.entity.UOrder;
import com.study.entity.UUser;
import com.study.service.AlibabaOrderService;
import com.study.service.SeataPaymentService;
import com.study.service.SeataStorageService;
import io.seata.spring.annotation.GlobalTransactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author ouyang
 * @version 1.0
 * @date 2020/6/12 21:28
 **/
@Service
public class AlibabaOrderServiceImpl implements AlibabaOrderService {

    private final AlibabaOrderDao alibabaOrderDao;
    private final SeataPaymentService seataPaymentService;
    private final SeataStorageService seataStorageService;

    private final Logger logger = LoggerFactory.getLogger(AlibabaOrderServiceImpl.class);

    @Autowired
    public AlibabaOrderServiceImpl(AlibabaOrderDao alibabaOrderDao, SeataPaymentService seataPaymentService,
                                   SeataStorageService seataStorageService) {
        this.alibabaOrderDao = alibabaOrderDao;
        this.seataPaymentService = seataPaymentService;
        this.seataStorageService = seataStorageService;
    }

    @Override
    public UOrder findUOrderById(Long id) {
        return alibabaOrderDao.findOrderById(id);
    }

    // 阿里巴巴分布式事务
    @GlobalTransactional
    @Override
    public void saveUOrder(UOrder uOrder) throws Exception {

        logger.info("【1】开始保存订单....");
        // 1. 保存订单
        alibabaOrderDao.saveOrder(uOrder);

        logger.info("【1】保存订单成功....");

        logger.info("【2】开始扣除商品数量....");
        // 2. 查询商品信息
        UGoods goodsInfo = seataStorageService.findGoodsById(uOrder.getGoodsId());
        // 2.1 扣除商品数量
        Integer goodsCount = uOrder.getGoodsCount();
        if (0 > goodsCount || goodsCount > 100) {
            throw new Exception("库存不够");
        }
        goodsInfo.setUseCount(goodsInfo.getUseCount() + goodsCount);
        seataStorageService.saveGoods(goodsInfo);
        logger.info("【2】扣除商品数量成功....");

        logger.info("【3】开始扣减用户金额....");
        // 3. 查询用户信息
        UUser user = seataPaymentService.findUserById(uOrder.getUserId());
        // 3.1 扣减金额
        BigDecimal money = goodsInfo.getPrice()
                .multiply(new BigDecimal(goodsCount.toString()));


        user.setUseMoney(user.getUseMoney().add(money));

        if (user.getUseMoney().compareTo(user.getMoney()) > 0) {
            throw new Exception("金额不够");
        }
        seataPaymentService.saveUUser(user);
        logger.info("【3】扣减用户金额成功....");
    }
}
