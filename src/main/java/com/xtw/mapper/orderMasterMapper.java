package com.xtw.mapper;

import com.xtw.entity.orderMaster;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface orderMasterMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(orderMaster record);

    int insertSelective(orderMaster record);

    orderMaster selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(orderMaster record);

    int updateByPrimaryKey(orderMaster record);
}