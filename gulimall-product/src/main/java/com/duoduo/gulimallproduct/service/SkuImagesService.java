package com.duoduo.gulimallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.duoduo.common.utils.PageUtils;
import com.duoduo.gulimallproduct.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author Lucas
 * @email sunlightcs@gmail.com
 * @date 2023-08-06 16:00:51
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

