package com.duoduo.gulimallproduct.service.impl;

import com.duoduo.gulimallproduct.service.CategoryService;
import com.duoduo.gulimallproduct.dao.CategoryDao;
import com.duoduo.gulimallproduct.entity.CategoryEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.duoduo.common.utils.PageUtils;
import com.duoduo.common.utils.Query;

import javax.annotation.Resource;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {
    @Resource
    private CategoryDao categoryDao;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> queryListTree() {
        // 查询全部
        List<CategoryEntity> categoryEntities = categoryDao.selectList(null);
        //进行排序
        return categoryEntities.stream()
                .filter(categoryEntity -> categoryEntity.getCatLevel() == 1)
                .peek(categoryEntity -> categoryEntity.setChildren(getChildren(categoryEntity, categoryEntities)))
                .sorted(Comparator.comparingInt(CategoryEntity::getSort)).collect(Collectors.toList());
    }

    private List<CategoryEntity> getChildren(CategoryEntity categoryEntity, List<CategoryEntity> categoryEntities) {
        return categoryEntities.stream()
                .filter(entity -> entity.getParentCid().equals(categoryEntity.getCatId()))
                .peek(entity -> entity.setChildren(getChildren(entity, categoryEntities)))
                .sorted(Comparator.comparingInt(menu ->  menu.getSort() == null ? 0 : menu.getSort()))
                .collect(Collectors.toList());
    }
}