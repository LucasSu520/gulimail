package com.duoduo.gulimallproduct.service.impl;

import com.duoduo.gulimallproduct.service.CommentReplayService;
import com.duoduo.gulimallproduct.dao.CommentReplayDao;
import com.duoduo.gulimallproduct.entity.CommentReplayEntity;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.duoduo.common.utils.PageUtils;
import com.duoduo.common.utils.Query;


@Service("commentReplayService")
public class CommentReplayServiceImpl extends ServiceImpl<CommentReplayDao, CommentReplayEntity> implements CommentReplayService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CommentReplayEntity> page = this.page(
                new Query<CommentReplayEntity>().getPage(params),
                new QueryWrapper<CommentReplayEntity>()
        );

        return new PageUtils(page);
    }

}