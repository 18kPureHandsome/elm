package com.xtw.Vo;

import lombok.Data;

/**
 * Created by xiaotianwen on 2019/3/3.
 * 回调信息vo
 */
@Data
public class ResultVo<T> {

    private Integer code;

    private String msg;

    private T data;

    public ResultVo(){

    }

    public ResultVo(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
