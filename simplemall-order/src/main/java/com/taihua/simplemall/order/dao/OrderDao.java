package com.taihua.simplemall.order.dao;

import com.taihua.simplemall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zhangth
 * @email zhangth1013@163.com
 * @date 2020-07-05 23:09:42
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
