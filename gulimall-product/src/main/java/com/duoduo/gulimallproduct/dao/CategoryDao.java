package com.duoduo.gulimallproduct.dao;

import com.duoduo.gulimallproduct.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Lucas
 * @email sunlightcs@gmail.com
 * @date 2023-08-06 16:00:51
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
