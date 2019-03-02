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
}
