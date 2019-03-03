package com.xtw.controller;

import com.xtw.Util.ResultVoUtil;
import com.xtw.Vo.ProductCategoryVo;
import com.xtw.Vo.ProductInfoVo;
import com.xtw.Vo.ResultVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaotianwen on 2019/3/3.
 */
@RestController()
@RequestMapping("/buyer")
public class SellController {


    @GetMapping("/product/list")
    public ResultVo productList(){
        ProductCategoryVo productCategoryVo = new ProductCategoryVo();
        ProductInfoVo productInfoVo = new ProductInfoVo();
        List<ProductInfoVo> list = new ArrayList<ProductInfoVo>();
        list.add(productInfoVo);
        productCategoryVo.setProductInfoVoList(list);
        return ResultVoUtil.SuccessVo(productCategoryVo);
    }
}
