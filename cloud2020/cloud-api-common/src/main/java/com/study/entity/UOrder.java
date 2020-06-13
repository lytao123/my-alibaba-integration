package com.study.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author ouyang
 * @version 1.0
 * @date 2020/6/12 21:24
 **/
@Data
public class UOrder {

    private Long id;

    private Long userId;

    private Long goodsId;

    private Integer goodsCount;

    private Date createTime;
}
