package com.duoduo.gulimallproduct.service.impl;

import com.duoduo.gulimallproduct.service.BrandService;
import com.duoduo.gulimallproduct.dao.BrandDao;
import com.duoduo.gulimallproduct.entity.BrandEntity;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.duoduo.common.utils.PageUtils;
import com.duoduo.common.utils.Query;


@Service("brandService")
public class BrandServiceImpl extends ServiceImpl<BrandDao, BrandEntity> implements BrandService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<BrandEntity> page = this.page(
                new Query<BrandEntity>().getPage(params),
                new QueryWrapper<BrandEntity>()
        );

        return new PageUtils(page);
    }

}