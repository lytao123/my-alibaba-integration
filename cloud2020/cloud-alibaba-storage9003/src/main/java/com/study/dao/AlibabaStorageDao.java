package com.study.dao;

import com.study.entity.UGoods;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author ouyang
 * @version 1.0
 * @date 2020/6/12 21:31
 **/
@Mapper
@Component
public interface AlibabaStorageDao {

    /**
     * 查询商品信息
     * @param id 主键
     * @return 商品信息
     */
    UGoods findGoodsById(Long id);

    /**
     * 保存商品信息
     * @param uGoods 商品信息
     */
    void saveGoods(UGoods uGoods);
}
