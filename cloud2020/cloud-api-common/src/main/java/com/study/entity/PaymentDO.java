package com.study.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 支付
 * @author ouyang
 * @version 1.0
 * @date 2020/4/27 23:02
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDO {
    private Long id;

    private String payName;

    private BigDecimal amount;

    private Date createTime;

    private Date updateTime;

    public PaymentDO(String payName, BigDecimal amount, Date createTime) {
        this.payName = payName;
        this.amount = amount;
        this.createTime = createTime;
        this.updateTime = new Date();
    }
}
