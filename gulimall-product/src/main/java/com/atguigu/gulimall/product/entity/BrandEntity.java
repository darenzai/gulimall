package com.atguigu.gulimall.product.entity;


import com.atguigu.common.valid.AddGroup;
import com.atguigu.common.valid.ListValue;
import com.atguigu.common.valid.UpdateGroup;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.NonNull;
import org.hibernate.validator.constraints.URL;
import org.springframework.beans.factory.annotation.Value;

import javax.validation.constraints.*;

/**
 * 品牌
 * 
 * @author darenzai
 * @email darenzai@163.com
 * @date 2021-04-09 19:26:39
 */
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 品牌id
	 */
	@NotNull(message ="修改必须指定品牌Id",groups = {UpdateGroup.class})
	@Null(message = "新增不能指定品牌Id",groups = {AddGroup.class})
	@TableId
	private Long brandId;
	/**
	 * 品牌名
	 */
	@NotBlank(message = "品牌名不能为空",groups = {AddGroup.class,UpdateGroup.class})
	private String name;
	/**
	 * 品牌logo地址
	 */
	@NotEmpty(groups = {AddGroup.class})
	@URL(message = "logo这必须是一个合法的URL地址",groups = {AddGroup.class,UpdateGroup.class})
	private String logo;
	/**
	 * 介绍
	 */
	private String descript;
	/**
	 * 显示状态[0-不显示；1-显示]
	 */
	@ListValue(vals={0,1})
	private Integer showStatus;
	/**
	 * 检索首字母
	 */
	@NotNull(groups  = {AddGroup.class})
	@Pattern(regexp = "^[a-zA-Z]$",message = "检索首字符必须是一个字母",groups  = {AddGroup.class,UpdateGroup.class} )
	private String firstLetter;
	/**
	 * 排序
	 */
	@NotNull(groups  = {AddGroup.class})
	@Min(value = 0,message = "排序必须大于等于0")
	private Integer sort;

}
