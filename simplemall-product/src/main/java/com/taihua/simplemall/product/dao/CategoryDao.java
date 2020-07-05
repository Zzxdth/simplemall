package com.taihua.simplemall.product.dao;

import com.taihua.simplemall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zhangth
 * @email zhangth1013@163.com
 * @date 2020-07-05 21:30:49
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
