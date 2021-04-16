package com.atguigu.guilimall.product;


import com.atguigu.gulimall.product.GulimallProductApplication;
import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import com.atguigu.gulimall.product.service.CategoryService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import javafx.application.Application;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Arrays;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = GulimallProductApplication.class)
class GulimallProductApplicationTests {

   @Resource
    BrandService brandService;
   @Autowired
   CategoryService categoryService;

    @Test
    void testFindPath(){
       Long[] catelogPath = categoryService.findCatelogPath(225L);
       log.info("完整路径：{}"+ Arrays.asList(catelogPath));
   }

    @Test
    void contextLoads() {

//        BrandEntity brandEntity=new BrandEntity();
//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("");
//        brandEntity.setName("华为");

        //brandService.updateById(brandEntity);
//        brandService.save(brandEntity);
//        System.out.println("保存成功");
    }

}
