package com.duoduo.gulimallproduct.service.impl;

import com.duoduo.gulimallproduct.service.AttrService;
import com.duoduo.gulimallproduct.dao.AttrDao;
import com.duoduo.gulimallproduct.entity.AttrEntity;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.duoduo.common.utils.PageUtils;
import com.duoduo.common.utils.Query;


@Service("attrService")
public class AttrServiceImpl extends ServiceImpl<AttrDao, AttrEntity> implements AttrService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AttrEntity> page = this.page(
                new Query<AttrEntity>().getPage(params),
                new QueryWrapper<AttrEntity>()
        );

        return new PageUtils(page);
    }

}