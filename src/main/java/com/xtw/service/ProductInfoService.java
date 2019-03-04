package com.xtw.service;

import com.xtw.entity.ProductInfo;

import java.util.List;

/**
 * @author : tianwen.xiao
 * @ClassName : ProductInfoService
 * @Description :
 * @date : created in 2019/3/4 11:44 AM
 * @Version : 1.0
 */
public interface ProductInfoService {
    int deleteByPrimaryKey(String productId);

    int insert(ProductInfo record);

    int insertSelective(ProductInfo record);

    ProductInfo selectByPrimaryKey(String productId);

    int updateByPrimaryKeySelective(ProductInfo record);

    int updateByPrimaryKey(ProductInfo record);

    List<ProductInfo> findUpAll();
}
