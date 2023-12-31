package com.duoduo.gulimallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.duoduo.common.utils.PageUtils;
import com.duoduo.gulimallproduct.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author Lucas
 * @email sunlightcs@gmail.com
 * @date 2023-08-06 16:00:51
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

