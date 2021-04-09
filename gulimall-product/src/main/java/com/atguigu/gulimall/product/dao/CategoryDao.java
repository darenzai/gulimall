package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author darenzai
 * @email darenzai@163.com
 * @date 2021-04-09 19:26:39
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
