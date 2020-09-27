package com.ganymede.dao.impl;

import com.ganymede.dao.OrderDao;
import com.ganymede.entity.Order;
import com.ganymede.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderDaoImpl implements OrderDao {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public void insertOrderInfo(Order order) {
        orderMapper.insertOrderInfo(order);
    }
}
