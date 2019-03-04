package com.xtw.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author : tianwen.xiao
 * @ClassName : ProductCategory
 * @Description : 商品类目entity
 * @date : created in 2019/3/4 10:08 AM
 * @Version : 1.0
 */
@Data
public class ProductCategory {
    /** id */
    private Integer categoryId;

    /** 类目名字*/
    private String categoryName;

    /** 类目编号*/
    private Integer categoryType;

    /** 创建时间*/
    private Date createTime;

    /** 修改时间*/
    private Date updateTime;


}