package com.yiidian.dao;

import com.yiidian.domain.Order;
import com.yiidian.domain.User;

import java.util.List;

/**
 * 订单Dao接口
 * 一点教程网 - www.yiidian.com
 */
public interface OrderDao {
    /**
     * 查询所有订单
     */
    public List<Order> findAllOrders();
}
