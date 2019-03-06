package com.xtw.mapper;

import com.xtw.entity.OrderMaster;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMasterMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(OrderMaster record);

    int insertSelective(OrderMaster record);

    OrderMaster selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(OrderMaster record);

    int updateByPrimaryKey(OrderMaster record);

    List<OrderMaster> findByBuyerOpendId(String opendid);
}