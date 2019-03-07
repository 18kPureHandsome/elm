package com.xtw.converter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.xtw.dto.OrderDTO;
import com.xtw.entity.OrderDetail;
import com.xtw.enums.ExceptionEnums;
import com.xtw.exception.MyException;
import com.xtw.form.OrderForm;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : tianwen.xiao
 * @ClassName : OrderForm2OrderDTO
 * @Description : OrderForm转OrderDTO
 * @date : created in 2019/3/7 10:26 AM
 * @Version : 1.0
 */
@Slf4j
public class OrderForm2OrderDTO {

    public static OrderDTO converter(OrderForm orderForm) throws Exception{
        Gson gson = new Gson();
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerAddress(orderForm.getAddress());
        orderDTO.setBuyerPhone(orderForm.getPhone());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());
        List<OrderDetail> orderDetailList = new ArrayList<>();
        try {
            orderDetailList = gson.fromJson(orderForm.getItems(),
                    new TypeToken<List<OrderDetail>>() {
                    }.getType());
        }catch (Exception e){
            log.error("【对象转换】错误 item = {}",orderForm.getItems());
            throw new MyException(ExceptionEnums.PARAM_ERROR);
        }
        orderDTO.setOrderDetailList(orderDetailList);
        return orderDTO;
    }
}
