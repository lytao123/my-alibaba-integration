package com.study.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author ouyang
 * @version 1.0
 * @date 2020/4/27 23:08
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private String payName;

    private BigDecimal amount;
}
