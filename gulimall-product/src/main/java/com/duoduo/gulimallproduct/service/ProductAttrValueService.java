package com.duoduo.gulimallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.duoduo.gulimallproduct.entity.ProductAttrValueEntity;
import com.duoduo.common.utils.PageUtils;

import java.util.Map;

/**
 * spu属性值
 *
 * @author Lucas
 * @email sunlightcs@gmail.com
 * @date 2023-08-06 16:00:51
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

