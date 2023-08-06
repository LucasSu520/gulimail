package com.duoduo.gulimallproduct.service.impl;

import com.duoduo.gulimallproduct.service.ProductAttrValueService;
import com.duoduo.gulimallproduct.dao.ProductAttrValueDao;
import com.duoduo.gulimallproduct.entity.ProductAttrValueEntity;
import com.duoduo.common.utils.PageUtils;
import com.duoduo.common.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


@Service("productAttrValueService")
public class ProductAttrValueServiceImpl extends ServiceImpl<ProductAttrValueDao, ProductAttrValueEntity> implements ProductAttrValueService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ProductAttrValueEntity> page = this.page(
                new Query<ProductAttrValueEntity>().getPage(params),
                new QueryWrapper<ProductAttrValueEntity>()
        );

        return new PageUtils(page);
    }

}