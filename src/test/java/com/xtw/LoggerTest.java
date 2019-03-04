package com.xtw;

import com.xtw.entity.ProductCategory;
import com.xtw.mapper.ProductCategoryMapper;
import com.xtw.service.ProductCategoryService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by xiaotianwen on 2019/3/1.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {

    @Autowired
    private ProductCategoryService productCategoryService;

    @Test
    public void test1(){
        log.debug("debug.....");
        log.info("info.....");
        log.error("error.....");
    }

    @Test
    public void test2(){
        ProductCategory productCategory = productCategoryService.selectByPrimaryKey(1);
        log.info("得到的信息是{}",productCategory);
    }

    @Test
    public void test3(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryId(2);
        productCategory.setCategoryName("主食");
        productCategory.setCategoryType(2);
        Integer i = productCategoryService.updateByPrimaryKey(productCategory);
        log.info("得到的信息是{}",i);
    }

    @Test
    public void findByCategoryTypeInTest(){
        //List<Integer> list = Arrays.asList(1,2);
        List<ProductCategory> list = productCategoryService.findByCategoryTypeIn(Arrays.asList(0,2));
        log.info("得到的信息是{}",list);
    }
}
