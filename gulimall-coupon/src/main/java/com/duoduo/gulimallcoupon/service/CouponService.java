package com.duoduo.gulimallcoupon.service;

import com.duoduo.gulimallcoupon.entity.CouponEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.duoduo.common.utils.PageUtils;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author leifengyang
 * @email leifengyang@gmail.com
 * @date 2019-10-08 09:36:40
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

