package com.duoduo.gulimallorder.service.impl;

import com.duoduo.common.utils.PageUtils;
import com.duoduo.common.utils.Query;
import com.duoduo.gulimallorder.dao.OrderOperateHistoryDao;
import com.duoduo.gulimallorder.entity.OrderOperateHistoryEntity;
import com.duoduo.gulimallorder.service.OrderOperateHistoryService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("orderOperateHistoryService")
public class OrderOperateHistoryServiceImpl extends ServiceImpl<OrderOperateHistoryDao, OrderOperateHistoryEntity> implements OrderOperateHistoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrderOperateHistoryEntity> page = this.page(
                new Query<OrderOperateHistoryEntity>().getPage(params),
                new QueryWrapper<OrderOperateHistoryEntity>()
        );

        return new PageUtils(page);
    }

}