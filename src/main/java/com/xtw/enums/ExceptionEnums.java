package com.xtw.enums;

import lombok.Getter;

/**
 * @author : tianwen.xiao
 * @ClassName : ExceptionEnums
 * @Description :
 * @date : created in 2019/3/6 10:17 AM
 * @Version : 1.0
 */
@Getter
public enum ExceptionEnums {

    EXCEPTION_TIMEOUT(1,"请求超时"),
    ;

    private Integer code;

    private String message;

    ExceptionEnums(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
