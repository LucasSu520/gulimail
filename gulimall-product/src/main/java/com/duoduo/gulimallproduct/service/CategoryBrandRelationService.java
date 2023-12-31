package com.duoduo.gulimallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.duoduo.common.utils.PageUtils;
import com.duoduo.gulimallproduct.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author Lucas
 * @email sunlightcs@gmail.com
 * @date 2023-08-06 16:00:51
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveDetail(CategoryBrandRelationEntity categoryBrandRelation);

}

