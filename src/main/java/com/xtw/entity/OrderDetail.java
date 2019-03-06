package com.xtw.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class OrderDetail {

    /** detailId*/
    private String detailId;

    /** 订单id*/
    private String orderId;

    /** 商品id*/
    private String productId;

    /** 商品名称*/
    private String productName;

    /** 商品单价*/
    private BigDecimal productPrice;

    /** 商品数量*/
    private Integer productQuantity;

    /** 商品图片*/
    private String productIcon;

    /** 创建时间*/
    private Date createTime;

    /** 修改时间*/
    private Date updateTime;


}