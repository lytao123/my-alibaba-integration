package com.study.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 返回数据封装
 * @author ouyang
 * @version 1.0
 * @date 2020/4/28 0:03
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultMessage<T> {
    private Integer code;

    private String message;

    private T data;
}
