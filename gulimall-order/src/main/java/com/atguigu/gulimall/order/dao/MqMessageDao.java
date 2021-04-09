package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.MqMessageEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author darenzai
 * @email darenzai@163.com
 * @date 2021-04-09 22:31:41
 */
@Mapper
public interface MqMessageDao extends BaseMapper<MqMessageEntity> {
	
}
