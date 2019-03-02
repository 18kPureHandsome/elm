package com.xtw.mapper;

import com.xtw.entity.productInfo;

public interface productInfoMapper {
    int deleteByPrimaryKey(String productId);

    int insert(productInfo record);

    int insertSelective(productInfo record);

    productInfo selectByPrimaryKey(String productId);

    int updateByPrimaryKeySelective(productInfo record);

    int updateByPrimaryKey(productInfo record);
}