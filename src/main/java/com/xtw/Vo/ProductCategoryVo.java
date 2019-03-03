package com.xtw.Vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.context.annotation.PropertySource;

import java.util.List;

/**
 * Created by xiaotianwen on 2019/3/3.
 * 商品类别vo
 */
@Data
public class ProductCategoryVo {

    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVo> productInfoVoList;
}
