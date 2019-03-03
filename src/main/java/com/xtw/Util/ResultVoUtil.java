package com.xtw.Util;

import com.xtw.Vo.ResultVo;

/**
 * Created by xiaotianwen on 2019/3/3.
 * 回调信息工具类
 */
public class ResultVoUtil {

    public static ResultVo SuccessVo(Object object){
        return new ResultVo(0,"成功",object);
    }

    public static ResultVo ErroeVo(){
        return new ResultVo(1,"失败",null);
    }
}
