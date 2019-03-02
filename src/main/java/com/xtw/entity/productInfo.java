package com.xtw.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class productInfo {
    private String productId;

    private String productName;

    private BigDecimal productPrice;

    private Integer productStock;

    private String productDescription;

    private String productIcon;

    private Byte productStatus;

    private Integer categoryType;

    private Date createTime;

    private Date updateTime;
}