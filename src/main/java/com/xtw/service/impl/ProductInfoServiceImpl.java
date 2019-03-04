package com.xtw.service.impl;

import com.xtw.entity.ProductInfo;
import com.xtw.enums.ProductStatusEnum;
import com.xtw.mapper.ProductInfoMapper;
import com.xtw.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : tianwen.xiao
 * @ClassName : ProductInfoServiceImpl
 * @Description :
 * @date : created in 2019/3/4 11:46 AM
 * @Version : 1.0
 */
@Service
public class ProductInfoServiceImpl implements ProductInfoService {

    @Autowired
    private ProductInfoMapper productInfoMapper;

    @Override
    public int deleteByPrimaryKey(String productId) {
        return productInfoMapper.deleteByPrimaryKey(productId);
    }

    @Override
    public int insert(ProductInfo record) {
        return productInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(ProductInfo record) {
        return productInfoMapper.insertSelective(record);
    }

    @Override
    public ProductInfo selectByPrimaryKey(String productId) {
        return productInfoMapper.selectByPrimaryKey(productId);
    }

    @Override
    public int updateByPrimaryKeySelective(ProductInfo record) {
        return productInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ProductInfo record) {
        return productInfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return productInfoMapper.findByProductStatus(ProductStatusEnum.UP.getCode());
    }
}
