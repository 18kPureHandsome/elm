package com.xtw.mapper;

import com.xtw.entity.sellerInfo;

public interface sellerInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(sellerInfo record);

    int insertSelective(sellerInfo record);

    sellerInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(sellerInfo record);

    int updateByPrimaryKey(sellerInfo record);
}