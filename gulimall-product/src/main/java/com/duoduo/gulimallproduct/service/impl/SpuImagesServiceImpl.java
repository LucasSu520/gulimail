package com.duoduo.gulimallproduct.service.impl;

import com.duoduo.gulimallproduct.service.SpuImagesService;
import com.duoduo.gulimallproduct.dao.SpuImagesDao;
import com.duoduo.gulimallproduct.entity.SpuImagesEntity;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.duoduo.common.utils.PageUtils;
import com.duoduo.common.utils.Query;


@Service("spuImagesService")
public class SpuImagesServiceImpl extends ServiceImpl<SpuImagesDao, SpuImagesEntity> implements SpuImagesService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SpuImagesEntity> page = this.page(
                new Query<SpuImagesEntity>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageUtils(page);
    }

}