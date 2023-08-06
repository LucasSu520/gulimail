package com.duoduo.gulimallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.duoduo.gulimallproduct.entity.SpuInfoEntity;
import com.duoduo.common.utils.PageUtils;

import java.util.Map;

/**
 * spu信息
 *
 * @author Lucas
 * @email sunlightcs@gmail.com
 * @date 2023-08-06 16:00:51
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

