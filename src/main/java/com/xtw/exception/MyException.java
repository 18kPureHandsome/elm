package com.xtw.exception;

import com.xtw.enums.ExceptionEnums;
import lombok.Getter;

/**
 * @author : tianwen.xiao
 * @ClassName : MyException
 * @Description : 自定义异常
 * @date : created in 2019/3/6 10:14 AM
 * @Version : 1.0
 */
@Getter
public class MyException extends Exception {

    private Integer code;

    public MyException(ExceptionEnums enums){
        super(enums.getMessage());
        this.code = enums.getCode();
    }
}
