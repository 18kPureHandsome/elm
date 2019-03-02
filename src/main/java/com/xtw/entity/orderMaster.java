package com.xtw.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class orderMaster {
    private String orderId;

    private String buyerName;

    private String buyerPhone;

    private String buyerAddress;

    private String buyerOpenid;

    private BigDecimal orderAmount;

    private Byte orderStatus;

    private Byte payStatus;

    private Date createTime;

    private Date updateTime;
}