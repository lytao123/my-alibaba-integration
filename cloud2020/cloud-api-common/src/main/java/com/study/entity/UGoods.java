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
public class UGoods {

    private Long id;

    private Integer goodCount;

    private Integer useCount;

    private BigDecimal price;

    private Date createTime;
}
