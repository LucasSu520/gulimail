package com.duoduo.gulimallproduct.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.duoduo.gulimallproduct.entity.CategoryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.duoduo.gulimallproduct.service.CategoryService;
import com.duoduo.common.utils.PageUtils;
import com.duoduo.common.utils.R;

import javax.validation.Valid;


/**
 * 商品三级分类
 *
 * @author Lucas
 * @email sunlightcs@gmail.com
 * @date 2023-08-06 16:00:51
 */
@RestController
@RequestMapping("product/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = categoryService.queryPage(params);

        return R.ok().put("page", page);
    }

    @GetMapping("/list/tree")
    public R listTree(){
        List<CategoryEntity> categoryEntities = categoryService.queryListTree();
        return R.ok().put("data", categoryEntities);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    public R info(@PathVariable("catId") Long catId){
		CategoryEntity category = categoryService.getById(catId);

        return R.ok().put("category", category);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@Valid @RequestBody CategoryEntity category){
		categoryService.save(category);

        return R.ok();
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    public R update(@RequestBody @Valid CategoryEntity category){
		categoryService.updateById(category);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] catIds){
		categoryService.removeByIds(Arrays.asList(catIds));

        return R.ok();
    }

}
