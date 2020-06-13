package com.study.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author ouyang
 * @version 1.0
 * @date 2020/6/12 21:24
 **/
@Data
public class UUser {

    private Long id;

    private BigDecimal money;

    private BigDecimal useMoney;

    private Date createTime;
}
