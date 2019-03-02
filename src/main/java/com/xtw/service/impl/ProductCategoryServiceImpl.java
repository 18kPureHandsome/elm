package com.xtw.service.impl;

import com.xtw.entity.ProductCategory;
import com.xtw.mapper.ProductCategoryMapper;
import com.xtw.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : tianwen.xiao
 * @date : created in 2019/3/2 1:13 AM
 */
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    private ProductCategoryMapper mapper;

    @Override
    public int deleteByPrimaryKey(Integer categoryId) {
        return mapper.deleteByPrimaryKey(categoryId);
    }

    @Override
    public int insert(ProductCategory record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(ProductCategory record) {
        return mapper.insertSelective(record);
    }

    @Override
    public ProductCategory selectByPrimaryKey(Integer categoryId) {
        return mapper.selectByPrimaryKey(categoryId);
    }

    @Override
    public int updateByPrimaryKeySelective(ProductCategory record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ProductCategory record) {
        return mapper.updateByPrimaryKey(record);
    }
}
