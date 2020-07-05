package com.taihua.simplemall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.taihua.common.utils.PageUtils;
import com.taihua.simplemall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author zhangth
 * @email zhangth1013@163.com
 * @date 2020-07-05 21:30:49
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

