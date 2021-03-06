package com.xtw.entity;

import com.xtw.enums.OrderStatusEnums;
import com.xtw.enums.PayStatusEnums;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class OrderMaster {

    /** 订单id*/
    private String orderId;

    /** 买家名字*/
    private String buyerName;

    /** 买家电话*/
    private String buyerPhone;

    /** 买家地址*/
    private String buyerAddress;

    /** 买家openid*/
    private String buyerOpenid;

    /** 订单总金额*/
    private BigDecimal orderAmount;

    /** 订单状态*/
    private Integer orderStatus = OrderStatusEnums.NEW.getCode();

    /** 支付状态*/
    private Integer payStatus = PayStatusEnums.WAIT.getCode();

    /** 创建时间*/
    private Date createTime;

    /** 修改时间*/
    private Date updateTime;


}