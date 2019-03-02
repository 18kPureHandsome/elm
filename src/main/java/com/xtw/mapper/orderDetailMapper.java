package com.xtw.mapper;

import com.xtw.entity.orderDetail;

public interface orderDetailMapper {
    int deleteByPrimaryKey(String detailId);

    int insert(orderDetail record);

    int insertSelective(orderDetail record);

    orderDetail selectByPrimaryKey(String detailId);

    int updateByPrimaryKeySelective(orderDetail record);

    int updateByPrimaryKey(orderDetail record);
}