package com.taihua.simplemall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.taihua.common.utils.PageUtils;
import com.taihua.simplemall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author zhangth
 * @email zhangth1013@163.com
 * @date 2020-07-05 21:30:49
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

