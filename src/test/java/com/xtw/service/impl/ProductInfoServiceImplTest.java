package com.xtw.service.impl;

import com.xtw.entity.ProductInfo;
import com.xtw.service.ProductInfoService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductInfoServiceImplTest {
    @Autowired
    private ProductInfoService productInfoService;

    @Test
    public void findByProductStatus() {
        List<ProductInfo> list = productInfoService.findUpAll();
        log.info("得到的信息是{}",list);
    }
}