package com.taihua.simplemall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.taihua.common.utils.PageUtils;
import com.taihua.simplemall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author zhangth
 * @email zhangth1013@163.com
 * @date 2020-07-05 23:09:42
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

